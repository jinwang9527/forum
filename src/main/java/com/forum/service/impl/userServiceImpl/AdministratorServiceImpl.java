package com.forum.service.impl.userServiceImpl;

import com.forum.common.model.ResultModel;
import com.forum.common.model.Token;
import com.forum.common.utils.CollectionUtil;
import com.forum.common.utils.EncryptUtil;
import com.forum.common.utils.JWTUtil;
import com.forum.pojo.vo.userController.LoginVo;
import com.forum.repository.domain.Administrator;
import com.forum.repository.mapper.AdministratorMapper;
import com.forum.service.AdministratorService.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministratorServiceImpl implements AdministratorService {


    @Autowired
    private AdministratorMapper administratorMapper;

    @Override
    public ResultModel login(LoginVo loginVo) throws Exception {
        Administrator administrator=new Administrator();
        administrator.setAccount(loginVo.getAccount());
        administrator.setIsDel(false);
        List<Administrator> administrators = administratorMapper.selectByExample(administrator);
        if (CollectionUtil.isEmpty(administrators)) throw new  Exception("账户不存在");
        if (!EncryptUtil.md5(loginVo.getPassword(),administrators.get(0).getSalt()).equals(administrators.get(0).getPassword()))
            throw new Exception("密码错误");
        Token token=new Token();
        token.setUserId(administrators.get(0).getPkAdministratorId());
        return ResultModel.getSuccessResultModel((Object)JWTUtil.sign(token));
    }
}

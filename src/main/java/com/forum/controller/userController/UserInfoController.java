package com.forum.controller.userController;

import com.forum.common.model.ResultModel;
import com.forum.pojo.vo.userController.LoginVo;
import com.forum.service.AdministratorService.AdministratorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Api(tags = "系统 - 系统参数")
@RestController
@RequestMapping("user")
public class UserInfoController {

    @Autowired
    private AdministratorService administratorService;

    @ApiOperation(value = "登陆", notes = "靳旺")
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public ResultModel login(@RequestBody @Valid LoginVo loginVo) throws Exception {
        return administratorService.login(loginVo);
    }

}

package com.forum.service.AdministratorService;

import com.forum.common.model.ResultModel;
import com.forum.pojo.vo.userController.LoginVo;



public interface AdministratorService {

    ResultModel login(LoginVo loginVo) throws Exception;


}

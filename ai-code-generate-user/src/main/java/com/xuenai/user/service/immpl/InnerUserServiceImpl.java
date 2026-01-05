package com.xuenai.user.service.immpl;

import com.xuenai.aicodegenerate.innerservice.InnerUserService;
import com.xuenai.aicodegenerate.model.entity.User;
import com.xuenai.aicodegenerate.model.vo.user.UserVO;
import com.xuenai.user.service.UserService;
import jakarta.annotation.Resource;
import org.apache.dubbo.config.annotation.DubboService;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@DubboService
public class InnerUserServiceImpl implements InnerUserService {

    @Resource
    private UserService userService;

    @Override
    public List<User> listByIds(Collection<? extends Serializable> ids) {
        return userService.listByIds(ids);
    }

    @Override
    public User getById(Serializable id) {
        return userService.getById(id);
    }

    @Override
    public UserVO getUserVO(User user) {
        return userService.getUserVO(user);
    }
}


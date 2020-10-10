package com.gzhh.hrp.db.service.impl;

import com.gzhh.hrp.common.service.impl.BaseService;
import com.gzhh.hrp.db.dao.UserDao;
import com.gzhh.hrp.db.entity.User;
import com.gzhh.hrp.db.service.UserService;
import com.gzhh.hrp.tools.ResultView;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl extends BaseService implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public ResultView getList(HashMap<String, Object> filter) {
        ResultView result = new ResultView();
        List<User> userList =  userDao.getUserList(filter);
        result.putData("userList", userList);
        return result;
    }
}

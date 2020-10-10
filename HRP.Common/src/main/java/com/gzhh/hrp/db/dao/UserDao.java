package com.gzhh.hrp.db.dao;

import com.gzhh.hrp.common.BaseDao;
import com.gzhh.hrp.db.entity.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class UserDao extends BaseDao<User> {
    public List<User> getUserList(HashMap<String,Object> filter){
        return getList("DB_User.getUserList",filter);
    }
}

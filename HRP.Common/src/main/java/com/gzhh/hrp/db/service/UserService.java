package com.gzhh.hrp.db.service;

import com.gzhh.hrp.tools.ResultView;

import java.util.HashMap;

public interface UserService {
    public ResultView getList(HashMap<String, Object> filter);
}
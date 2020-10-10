package com.gzhh.hrp.db.action;

import com.gzhh.hrp.common.action.BaseAction;
import com.gzhh.hrp.db.service.UserService;
import com.gzhh.hrp.tools.ResultView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;

@Controller
@RequestMapping("/db/user/")
public class UserAction extends BaseAction {
    @Resource
    private UserService userService;

    @ResponseBody
    @RequestMapping("getList")
    public ResultView getList(HashMap<String,Object> filter){
        ResultView result = new ResultView();
        result = userService.getList(filter);
        return null;
    }
}

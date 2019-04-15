package com.ices.reservation.manager.web;

import com.ices.pojo.User;
import com.ices.pojo.system.Buser;
import com.ices.reservation.manager.service.LoginService;
import io.swagger.annotations.Api;
import javafx.scene.chart.ValueAxis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@RestController
@CrossOrigin
@Api(tags = {"登录接口"})
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping(path = {"/login/test"}, method = {RequestMethod.GET})
    @ResponseBody
    public String test() {
        return "123";
    }

    @RequestMapping(value = "/login/buser", method = RequestMethod.POST)
    public Object login(@RequestBody Buser buser){
        return loginService.login(buser);
    }

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public Object userLogin(@RequestBody User user){
        return loginService.userLogin(user);
    }

    @RequestMapping(value = "/user/register", method = RequestMethod.POST)
    public Object registerUser(@RequestBody User user){
        return loginService.registerUser(user);
    }

}

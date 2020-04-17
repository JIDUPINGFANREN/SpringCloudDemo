package com.changping.springcloud.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.changping.springcloud.entities.User;
import com.changping.springcloud.service.UserClientService;

@RestController
public class UserController_Consumer {
    @Autowired
    UserClientService userClientService;
    /**把8001端口里的代码粘过来，不需要考虑get和post方式*/
    @RequestMapping(value="/consumer/user/add")
    public boolean add(@RequestBody User user) 
    {
        boolean b = userClientService.add(user);
        return b;
    }
    
    @RequestMapping(value="/consumer/user/get/{id}")
    public User get(@PathVariable("id")String userId)
    {
        User user = userClientService.get(userId);
        return user;
    }
    
    @RequestMapping(value="/consumer/user/list")
    public List<User> list()
    {
        List<User> list_user = userClientService.list();
        return list_user;
    }
} 
package cn.tll.controller;

import cn.tll.pojo.User;
import cn.tll.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tll
 * @date 2020/4/24
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 根据id 调用service查询
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public User queryById(@PathVariable("id")Long id){
        return userService.queryById(id);
    }
}

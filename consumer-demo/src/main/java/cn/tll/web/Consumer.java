package cn.tll.web;

import cn.tll.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author tll
 * @date 2020/4/24
 */
@RestController
@RequestMapping("consumer")
public class Consumer {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("{id}")
    public User queryById(@PathVariable("id") Long id){
        String url = "http://localhost:8081/user/"+id;
        User user = restTemplate.getForObject(url, User.class);
        return user;
    }
}

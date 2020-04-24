package cn.tll.service;

import cn.tll.mapper.UserMapper;
import cn.tll.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tll
 * @date 2020/4/24
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据id调用通用mapper查询用户信息
     * @param id
     * @return
     */
    public User queryById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }
}

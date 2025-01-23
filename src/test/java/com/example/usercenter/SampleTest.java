package com.example.usercenter;

import com.example.usercenter.mapper.UserMapper;
import com.example.usercenter.model.User;
import jakarta.annotation.Resource;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Create 01/2025
 * @Author xiao
 * @Description
 */
@SpringBootTest
//@RunWith(SpringRunner.class)
public class SampleTest {
    /**
     * Autowired 按照class
     * Resource 按照 name
     */
    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertTrue(5 == userList.size());
        userList.forEach(System.out::println);
    }
}

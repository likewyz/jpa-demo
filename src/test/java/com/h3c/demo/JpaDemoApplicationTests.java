package com.h3c.demo;

import com.alibaba.fastjson.JSON;
import com.h3c.demo.repository.DeptRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JpaDemoApplication.class)
public class JpaDemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private DeptRepository deptRepository;

    @Test
    public void test(){
        List list = deptRepository.selectCustomDept();
        System.out.println(JSON.toJSONString(list));
    }

}

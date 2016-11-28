package com.xin.mapper;

import com.alibaba.fastjson.JSON;
import com.xin.domain.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 *
 * Created by l1 on 2016/11/25.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonMapperTest {

    @Autowired
    private PersonMapper personMapper;
    @Test
    public void selectPersonById() throws Exception {
        Person person = personMapper.selectPersonById(3);

        System.out.println(JSON.toJSONString(person,true));
    }

}
package com.xin.dao;

import com.alibaba.fastjson.JSON;
import com.xin.domain.City;
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
public class CityDaoTest {
    @Autowired
    private CityDao cityDao;
    @Test
    public void findOne() throws Exception {
        City city = cityDao.findOne(1);
        System.out.println(JSON.toJSONString(city,true));
    }

}
package com.xin.dao;

import com.xin.domain.City;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * Created by l1 on 2016/11/25.
 */
@Repository
public class CityDao {

    @Autowired
    private SqlSession sqlSession;

    public City findOne(Integer id){
        return sqlSession.selectOne("selectCityById",id);
    }

}

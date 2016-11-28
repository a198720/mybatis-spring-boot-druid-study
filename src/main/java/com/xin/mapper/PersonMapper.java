package com.xin.mapper;

import com.xin.domain.Person;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * Created by l1 on 2016/11/25.
 */
@Mapper
public interface PersonMapper {
    Person selectPersonById(Integer id);
}

package com.ices.reservation.manager.dao;

import com.ices.pojo.User;
import com.ices.reservation.common.sql.BaseDao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao extends BaseDao<User>{
}

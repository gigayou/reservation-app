package com.ices.reservation.manager.dao.system;

import com.ices.pojo.system.Role;
import com.ices.reservation.common.sql.BaseDao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RoleDao extends BaseDao<Role>{
}

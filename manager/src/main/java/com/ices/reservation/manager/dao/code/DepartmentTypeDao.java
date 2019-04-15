package com.ices.reservation.manager.dao.code;

import com.ices.pojo.code.DepartmentType;
import com.ices.reservation.common.sql.BaseDao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DepartmentTypeDao extends BaseDao<DepartmentType> {
}

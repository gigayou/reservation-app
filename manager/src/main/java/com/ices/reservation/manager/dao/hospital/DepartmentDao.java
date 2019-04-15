package com.ices.reservation.manager.dao.hospital;

import com.ices.pojo.hospital.Department;
import com.ices.reservation.common.sql.BaseDao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DepartmentDao extends BaseDao<Department> {
}

package com.ices.reservation.manager.dao;

import com.ices.pojo.Patient;
import com.ices.reservation.common.sql.BaseDao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PatientDao extends BaseDao<Patient> {
}

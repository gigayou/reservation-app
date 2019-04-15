package com.ices.reservation.manager.dao.hospital;

import com.ices.pojo.hospital.Doctor;
import com.ices.reservation.common.sql.BaseDao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DoctorDao extends BaseDao<Doctor> {
}

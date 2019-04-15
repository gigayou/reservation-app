package com.ices.reservation.manager.dao.hospital;

import com.ices.pojo.hospital.Hospital;
import com.ices.reservation.common.sql.BaseDao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface HospitalDao extends BaseDao<Hospital> {
    @SelectProvider(
            type = HospitalProvider.class,
            method = "getHospitalDepartmentType"
    )
    List<Map> getHospitalDepartmentType(String hospitalId);
}

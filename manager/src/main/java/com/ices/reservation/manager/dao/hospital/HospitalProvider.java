package com.ices.reservation.manager.dao.hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HospitalProvider {
    private Logger log = LoggerFactory.getLogger(CalendarProvider.class);

    public String getHospitalDepartmentType(String hospitalId){
        StringBuilder sql = new StringBuilder("select c.department_type_id as id, c.department_type_name as name from department_code c, hospital_department d\n" +
                "where d.type_id = c.department_type_id and d.hospital_id = '");
        sql.append(hospitalId + "'\n");
        sql.append("group by c.department_type_name");
        log.info("SQL: {}", sql);
        return sql.toString();
    }

    public String getHospitalByManagerId(String userId) {
        StringBuilder sb = new StringBuilder();
        sb.append("select * from hospital_info where hospital_manager = ")
                .append("'").append(userId).append("'");
        String sql = sb.toString();
        log.info("SQL: {}", sql);
        return sql;
    }
}

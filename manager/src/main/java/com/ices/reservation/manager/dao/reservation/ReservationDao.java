package com.ices.reservation.manager.dao.reservation;

import com.ices.pojo.reservation.Reservation;
import com.ices.reservation.common.sql.BaseDao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ReservationDao extends BaseDao<Reservation> {
    @SelectProvider(
            type = ReservationProvider.class,
            method = "getPageListByName"
    )
    List<Map> getPageListByName(@Param("reservation") Reservation reservation);

    @SelectProvider(
            type = ReservationProvider.class,
            method = "countByName"
    )
    Integer countByName(@Param("reservation") Reservation reservation);
}

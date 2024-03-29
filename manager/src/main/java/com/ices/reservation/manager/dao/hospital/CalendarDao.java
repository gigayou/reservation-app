package com.ices.reservation.manager.dao.hospital;

import com.ices.pojo.hospital.Calendar;
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
public interface CalendarDao extends BaseDao<Calendar> {
    @SelectProvider(
            type = CalendarProvider.class,
            method = "getListByName"
    )
    List<Map> getListByName(@Param("calendar") Calendar calendar);

    @SelectProvider(
            type = CalendarProvider.class,
            method = "countListByName"
    )
    Integer countListByName(@Param("calendar") Calendar calendar);

    @SelectProvider(
            type = CalendarProvider.class,
            method = "getCalendarByDate"
    )
    List<Map> getCalendarByDate(@Param("calendar") Calendar calendar, @Param("begin") String begin, @Param("end") String end);

    @SelectProvider(
            type = CalendarProvider.class,
            method = "getSelectCalendar"
    )
    List<Map> getSelectCalendar(@Param("calendar") Calendar calendar);
}

package com.ices.reservation.manager.web.reservation;

import com.ices.pojo.reservation.Reservation;
import com.ices.pojo.hospital.Calendar;
import com.ices.reservation.common.utils.ClassUtil;
import com.ices.reservation.manager.service.reservation.ReservationService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping(value = "/reservation")
@Api(tags = {"预约接口"})
public class ReservationController{

    @Autowired
    ReservationService reservationService;

    @RequestMapping(value = "add", method = {RequestMethod.POST})
    public Object addReservation(@RequestBody Reservation reservation){
        return reservationService.reservation(reservation);
    }

    @RequestMapping(value = "detail", method = {RequestMethod.POST})
    public Object getReservation(@RequestBody Reservation reservation){
        return reservationService.getDetail(reservation);
    }

    @RequestMapping(value = "list", method = {RequestMethod.POST})
    public Object listReservation(@RequestBody Reservation reservation){
        return reservationService.getListUsedByBase(reservation, null);
    }

    @RequestMapping(value = "cancel", method = {RequestMethod.POST})
    public Object cancelReservation(@RequestBody Reservation reservation){
        return reservationService.cancelReservation(reservation);
    }

    @RequestMapping(value = "listbydoctor", method = {RequestMethod.POST})
    public Object getReservationByDoctor(@RequestBody Map params){
        Calendar calendar = ClassUtil.mapToClass((Map) params.get("calendar"), Calendar.class);
        String patientName = (String) params.get("patientName");
        return reservationService.getReservationByDoctor(calendar, patientName);
    }

    @RequestMapping(value = "update", method = {RequestMethod.POST})
    public Object updateReservation(@RequestBody Reservation reservation){
        return reservationService.updateUsedByBase(reservation);
    }
}

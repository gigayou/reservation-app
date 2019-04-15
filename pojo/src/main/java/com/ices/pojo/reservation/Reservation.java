package com.ices.pojo.reservation;

import com.ices.pojo.hospital.Calendar;
import com.ices.reservation.common.sql.Column;
import com.ices.reservation.common.sql.RefColumn;
import com.ices.reservation.common.sql.Table;
import com.ices.reservation.common.utils.Page;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@Table(name = "reservation_info")
public class Reservation extends Page {
    @Column(column = "reservation_id", isId = true)
    public String reservationId;
    @Column(column = "user_phone")
    public String userPhone;
    @Column(column = "patient_id")
    public String patientId;
    @RefColumn(refSql = "(select patient_name from patient_info where patient_id = patientId)")
    public String patientName;
    @Column(column = "admission_id")
    public String admissionId;
    @Column(column = "is_admission")
    public Integer isAdmission;
    public Calendar calendar;
}

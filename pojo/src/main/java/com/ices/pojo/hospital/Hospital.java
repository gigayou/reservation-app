package com.ices.pojo.hospital;

import com.ices.reservation.common.sql.Column;
import com.ices.reservation.common.sql.RefColumn;
import com.ices.reservation.common.sql.Table;
import com.ices.reservation.common.utils.Page;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@Table(name = "hospital_info")
public class Hospital extends Page{
    @Column(column = "hospital_id", isId = true)
    public String hospitalId;
    @Column(column = "hospital_manager")
    public String hospitalManager;
    @RefColumn(refSql = "(select user_name from buser_info where login_id = hospitalManager)")
    public String managerName;
    @NotEmpty(message = "请填写医院名称")
    @Column(column = "hospital_name", isUseLike = true)
    public String hospitalName;
    @NotEmpty(message = "请选择医院级别")
    @Column(column = "hospital_grade")
    public String hospitalGrade;
//    @NotEmpty(message = "请选择医院地址")
//    @Column(column = "province")
//    public String province;
//    @RefColumn(refSql = "(select address_name from addr_code where address_id = province)")
//    public String provinceName;
//    @NotEmpty(message = "请选择医院地址")
//    @Column(column = "city")
//    public String city;
//    @RefColumn(refSql = "(select address_name from addr_code where address_id = city)")
//    public String cityName;
//    @NotEmpty(message = "请选择医院地址")
//    @Column(column = "county")
//    public String county;
//    @RefColumn(refSql = "(select address_name from addr_code where address_id = county)")
//    public String countyName;
    @Column(column = "detail_addr")
    public String detailAddr;
    @Column(column = "hospital_phone")
    public String hospitalPhone;
    @Column(column = "introduction")
    public String introduction;
    @Column(column = "is_valid")
    public String isValid;
    @Column(column = "hospital_picture")
    public String hospitalPicture;

}

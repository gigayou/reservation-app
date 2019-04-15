package com.ices.reservation.manager.web;

import com.ices.pojo.Patient;
import com.ices.reservation.common.sql.BaseController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "patient")
@Api(tags = {"就诊人接口"})
public class PatientController extends BaseController<Patient> {
}

package com.ices.reservation.manager.service;

import com.ices.pojo.Patient;
import com.ices.reservation.common.sql.BaseService;
import com.ices.reservation.common.utils.IdUtil;
import org.springframework.stereotype.Service;

@Service
public class PatientService extends BaseService<Patient> {
    @Override
    protected void beforeAdd(Patient clz) throws RuntimeException {
        clz.setPatientId(IdUtil.generateId());
    }
}

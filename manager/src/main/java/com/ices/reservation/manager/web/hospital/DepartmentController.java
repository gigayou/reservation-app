package com.ices.reservation.manager.web.hospital;

import com.ices.pojo.hospital.Department;
import com.ices.reservation.common.sql.BaseController;
import com.ices.reservation.manager.service.hospital.DepartmentService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "hospital/department")
@Api(tags = "科室管理接口")
public class DepartmentController extends BaseController<Department>{

    @Autowired
    DepartmentService departmentService;

    @RequestMapping(value = "listbytype", method = RequestMethod.POST)
    public Object listByType(@RequestBody Department department){
        return departmentService.listByType(department);
    }
}

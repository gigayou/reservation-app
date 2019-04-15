package com.ices.reservation.manager.web.code;

import com.ices.pojo.code.Address;
import com.ices.reservation.common.sql.BaseController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "code/address")
@Api(tags = {"地址编码管理接口"})
public class AddressController extends BaseController<Address> {
}

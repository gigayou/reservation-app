package com.ices.reservation.common.sql;

import com.ices.reservation.common.utils.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

public class BaseController<T> {
    @Autowired
    public BaseService<T> baseService;

    @RequestMapping(
            value = {"/add"},
            method = {RequestMethod.POST}
    )
    public Object addUsedByBase(@RequestBody @Valid T clz, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return ReturnUtil.error(bindingResult.getFieldError().getDefaultMessage());
        }else{
            return this.baseService.addOneUsedByBase(clz);
        }
    }

    @RequestMapping(
            value = {"/update"},
            method = {RequestMethod.POST}
    )
    public Object updateUsedByBase(@RequestBody @Valid T clz, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return ReturnUtil.error(bindingResult.getFieldError().getDefaultMessage());
        }else{
            return this.baseService.updateUsedByBase(clz);
        }
    }

    @RequestMapping(
            value = {"/delete"},
            method = {RequestMethod.POST}
    )
    public Object deleteUsedByBase(@RequestBody T clz) {
        return this.baseService.deleteUsedByBase(clz);
    }

    @RequestMapping(
            value = {"/deleteList"},
            method = {RequestMethod.POST}
    )
    public Object deleteAllUsedByBase(@RequestBody List<T> list) { return this.baseService.deleteAllUsedByBase(list); }

    @RequestMapping(
            value = {"/detail"},
            method = {RequestMethod.POST}
    )
    public Object detailUsedByBase(@RequestBody T clz) {
        return this.baseService.detailUsedByBase(clz);
    }

    @RequestMapping(
            value = {"/pagelist"},
            method = {RequestMethod.POST}
    )
    public Object getPageListUsedByBase(@RequestBody T clz) {
        return this.baseService.getPageListUsedByBase(clz, (String) null);
    }

    @RequestMapping(
            value = {"/list"},
            method = {RequestMethod.POST}
    )
    public Object getListUsedByBase(@RequestBody T clz) {
        return this.baseService.getListUsedByBase(clz, (String)null);
    }

//    @RequestMapping(
//            value = {"/count"},
//            method = {RequestMethod.POST}
//    )
//    public Object getCount(@RequestBody T clz) {
//        return this.baseService.getCount(clz);
//    }
}
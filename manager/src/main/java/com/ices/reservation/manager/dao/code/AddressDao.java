package com.ices.reservation.manager.dao.code;

import com.ices.pojo.code.Address;
import com.ices.reservation.common.sql.BaseDao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AddressDao extends BaseDao<Address> {
}

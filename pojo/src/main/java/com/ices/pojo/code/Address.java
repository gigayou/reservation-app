package com.ices.pojo.code;

import com.ices.reservation.common.sql.Column;
import com.ices.reservation.common.sql.Table;
import com.ices.reservation.common.utils.Page;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Table(name = "addr_code")
public class Address extends Page {
    @Column(column = "id", isId = true)
    public Long id;
    @Column(column = "address_id")
    public String addressId;
    @Column(column = "pre_id")
    public String preId;
    @Column(column = "address_name", isUseLike = true)
    public String addressName;
    @Column(column = "level")
    public String level;
    public List children = new ArrayList<>();
}

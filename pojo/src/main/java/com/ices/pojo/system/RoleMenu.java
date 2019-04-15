package com.ices.pojo.system;

import com.ices.reservation.common.sql.Column;
import com.ices.reservation.common.sql.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "role_menu")
public class RoleMenu {
    @Column(column = "role_id", isId = true)
    public Long role_id;
    @Column(column = "menu_id", isId = true)
    public Long menu_id;
}

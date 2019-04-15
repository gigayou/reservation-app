package com.ices.reservation.manager.dao.system;

import com.ices.pojo.system.Menu;
import com.ices.reservation.common.sql.BaseDao;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface MenuDao extends BaseDao<Menu> {
    @Select(value = "select * from menu where menu_id in (select menu_id from role_menu where role_id = #{roleId}) order by menu_index")
    List<Map> getListByRole(Long roleId);
}

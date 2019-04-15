package com.ices.reservation.common.sql;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface RefColumn {
    String refSql() default "";

    String refTb() default "";

    String refCol() default "";

    String refWhereCol() default "";

    String masterCol() default "";
}

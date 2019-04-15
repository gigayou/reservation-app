package com.ices.reservation.common.sql;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Column {
    String column() default "";

    boolean isUpdateSet() default true;

    boolean isSelectSet() default true;

    boolean isId() default false;

    boolean isDateTime() default false;

    boolean isUseLike() default false;
}
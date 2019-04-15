package com.ices.reservation.common.utils;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class IdUtil {
    private static Random random = new Random();
    public static String generateId(){

        return String.valueOf(new Date().getTime()) + String.valueOf(random.nextInt(10000000));
    }

    public static String getUUID(){
        String uuid = UUID.randomUUID().toString();
        return uuid.replace("-", "");
    }
}

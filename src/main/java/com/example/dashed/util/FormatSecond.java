package com.example.dashed.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatSecond {
    public static String formatSecond(Long second) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (second == null) {
            return null;
        }
        return sdf.format(new Date(second * 1000));
    }
}

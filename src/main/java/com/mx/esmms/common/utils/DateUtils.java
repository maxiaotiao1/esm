package com.mx.esmms.common.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/***
 * 日期工具类
 */
public class DateUtils {

    private static final String FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final short YEAR = 1;
    public static final short MONTH = 2;

    /**
     * String 转 Date
     *
     * @param str 日期字符串
     */
    public static Date stringToDate(String str) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat(FORMAT);
        Date date = null;
        date = dateFormat.parse(str);
        return date;
    }

    /**
     * Date 转 String
     */
    public static String dateToString(Date date) {
        DateFormat dateFormat = new SimpleDateFormat(FORMAT);
        String strDate = null;
        if (date != null) {
            strDate = dateFormat.format(date);
        }
        return strDate;
    }


    /**
     * 时间加法
     *
     * @param number 天数 或月数 的数值
     * @param unit   天 或 月 的单位 unit 1为天 2为月
     * @return
     */
    public static String addDate(int number, short unit) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat(FORMAT);
        Calendar c = Calendar.getInstance();
        if (1 == unit) {
            c.add(Calendar.DAY_OF_MONTH, number);
        } else {
            c.add(Calendar.MONTH, number);
        }
        return dateFormat.format(c.getTime());
    }

}
package net.sdh.tech.DateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CalendarTest {
    public static void main(String[] args) {
        long n = System.currentTimeMillis();
        System.out.println(n);
        Date dt = new Date(n);
        SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(dt);

        //String 转 Date
        Date ds = null;
        try {
//            ds = sdf.parse(format);
            ds = sdf.parse("2020-08-27 11:42:22");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Date类型"+ds);
        System.out.println("String类型"+format);

        Calendar ca = Calendar.getInstance();
        ca.add(ca.MONTH, -12);
//        System.out.println(ca.get(ca.MONTH) + "---" + ca.get(Calendar.YEAR));
        ca.setTime(ds);
        System.out.println(ca);
        System.out.println(ca.get(ca.YEAR));
        System.out.println(ca.YEAR);

        List<String> l = new ArrayList<>();
        l.add("123");
        l.add("321");

    }
}

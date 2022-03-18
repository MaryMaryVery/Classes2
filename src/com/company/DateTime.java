package com.company;



import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTime {
    public static void main(String[] args){
        Date date1= new Date();
        System.out.println(date1);
        Calendar calendar = new GregorianCalendar(2022,2,17);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR,1);
        Date date2 = calendar.getTime();
        System.out.println(calendar.getTime());

        boolean b = date1.after(date2);
        System.out.println(b);
        //
        long diff = date1.getTime()-date2.getTime();
        long hours= diff/(1000*60*60);
        System.out.println(hours);


    }



}

package Chapter_Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calender_demo {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy");
        System.out.println(sdf.format(cal.getTime()));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(cal.get(Calendar.AM_PM));
        System.out.println(cal.get(Calendar.AM_PM));


    }
}

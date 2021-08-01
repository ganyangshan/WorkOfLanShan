package Work1.Task3;

import java.util.Calendar;

/**
 * 面向对象实现时钟
 *
 * 自实现一个时钟类，时间到输入方式要包括一下两种方式：
 *
 * 1. 自定义年月日
 * 2. 把时钟时间设置为程序运行时的时间
 *
 * 先通过以上两种方式中的任意一种方式设置时间，**一旦设置好时间后，时钟就开始不停运转**，即每秒输出当前时间的年、月、日
 */
public class Clock {
    private static int year;
    private static int month;
    private static int day;
    private static int hour;
    private static int minute;
    private static int second;
    //通过构造器获取当前时间
    public Clock(){
        Calendar now = Calendar.getInstance();
        year = now.get(Calendar.YEAR);
        month = now.get(Calendar.MONTH)+1;
        day = now.get(Calendar.DAY_OF_MONTH);hour=now.get(Calendar.HOUR_OF_DAY);
        minute = now.get(Calendar.MINUTE);
        second=now.get(Calendar.SECOND);
    }

    public void Begin(){
        second++;
        if (second>=60){
            second=0;
            minute++;
        }
        if (minute>=60){
            minute=0;
            hour++;
        }
        if (hour>=24){
            hour=0;
            day++;
        }
        if (month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            if (day>=31){
                day=0;
                month++;
            }
        }
        else if (month==4||month==6||month==9||month==11){
            if (day>=30){
                day=0;
                month++;
            }
        }
        if ((year%4==0)&&(year%100!=0)||(year%400==0)&&month==2){
            if (day>=29){
                day=0;
                month++;
            }
        }
        if (month==2){
            if (day>=28){
                day=0;
                month++;
            }
        }
        if (month>=12){
            month=0;
            year++;
        }

    }
    public void Show(){
        System.out.println(year+"年"+month+"月"+day+"日"+"  "+hour+":"+minute+":"+second);
    }

}

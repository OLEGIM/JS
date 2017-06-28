package Date;

import java.util.Date;

/**
 * Created by OLEG on 28.06.2017.
 */
public class Clock {
    public static void main(String [] args){
        Date CurrTime = new Date();
        int hours = CurrTime.getHours();
        int minutes = CurrTime.getMinutes();
        int seconds = CurrTime.getSeconds();

        System.out.println("Time : " +hours+":"+minutes+":"+seconds);
    }
}

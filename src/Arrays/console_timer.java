package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by OLEG on 22.06.2017.
 */
public class console_timer {
    public static void main(String[] args) throws InterruptedException, NumberFormatException, IOException{
        System.out.println("Enter the time in seconds");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(reader.readLine());
        int i=0;

        while (i<time){
            Thread.sleep(500);
            System.out.println("Tik");
            Thread.sleep(500);
            System.out.println("Tak");
            i++;
        }
        System.out.println("Time is up!");
    }
}

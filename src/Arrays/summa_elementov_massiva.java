package Arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by OLEG on 22.06.2017.
 */
public class summa_elementov_massiva {
    public static void main (String [] args){
        int[] array=new int [20];
        double average=0;
        long sum =0;
        Random random= new Random();

        for(int i =0; i < array.length; i++){
            array[i]=random.nextInt(10000);
        }
        for (int i=0; i< array.length; i++){
            sum += array[i];
        }

        System.out.println("Sum = " + sum);

        average = (double)sum / array.length;
        System.out.println("Average = " + average);

        System.out.println (Arrays.toString(array));

    }

}

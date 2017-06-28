package Arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by OLEG on 27.06.2017.
 */
public class MinValue {
    public static void main (String[] args){
        int[] array = new int[20];
        int Min;
        Random random = new Random();

        for (int i= 0; i < array.length; i++){
            array[i] = random.nextInt(10000);
        }

        Min = array[0];
        for(int i=0; i < array.length; i++){
            if (Min > array[i]){
                Min=array[i];
            }
        }
        System.out.println("Min = " + Min);
        System.out.print(Arrays.toString(array));
    }
    }


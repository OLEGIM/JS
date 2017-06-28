package Arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by OLEG on 27.06.2017.
 */

public class MaxValue {


        public static void main (String[] args){
            int[] array = new int[20];
            int Max;
            Random random = new Random();

            for (int i= 0; i < array.length; i++){
                array[i] = random.nextInt(10000);
            }

            Max = array[0];
            for(int i=0; i < array.length; i++){
                if (Max < array[i]){
                    Max = array[i];
                }
            }
            System.out.println("Max = " + Max);
            System.out.println(Arrays.toString(array));
        }
    }





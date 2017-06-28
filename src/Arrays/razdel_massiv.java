package Arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by OLEG on 23.06.2017.
 */
public class razdel_massiv {
    public static void main (String [] args){
        int [] array = new int[12]; // иницилизируем массив, размером 12
        Random random = new Random();

        for (int i=0; i < array.length; i++){
            array[i] = random.nextInt(60); //диапопазон значения
        }
        System.out.println(Arrays.toString(array));

        int[] arr1 = Arrays.copyOfRange(array,0,array.length/2); //С начала и до половины разбиваем
        int[] arr2 = Arrays.copyOfRange(array,array.length/2,array.length); //Разбиваем  с половины до конца
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
}

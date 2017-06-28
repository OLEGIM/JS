package Arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by OLEG on 27.06.2017.
 */
public class AddElement {
    public static void main (String[] args){
        int [] array = new int[10];
        Random random = new Random();
        int length = array.length;
        int value = -5;

        for (int i=0; i < array.length; i++){
        array[i] =random.nextInt(50);
    }
        System.out.println(Arrays.toString(array));
        System.out.println("length of massiv " + length);

        array = addElement(array, value);
        length = array.length;
        System.out.println(Arrays.toString(array));
        System.out.println("length of masssiv " + length);
    }

    public static int[] addElement(int[] array, int value) {
        int [] newArray = new int[array.length+1]; //увкличиваем массив на 1
        for (int i =0; i < newArray.length; i++){
            if (i < array.length)
                newArray[i] = array[i]; //добавим значение в newArray
                        else
                            newArray[i]= value;
        }
        return newArray;
    }
    }

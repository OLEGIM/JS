package Arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by OLEG on 28.06.2017.
 */
public class DelIndex {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        int length = array.length;
        int index = 4;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(array)); //output array elements
        System.out.println("Dlina massiva =  " + length);

        array = removeByIndex(array, index);
        length = array.length;
        System.out.println(Arrays.toString(array));
        System.out.println("Dlina massiva =  " + length);

    }

    public static int[] removeByIndex(int[] array, int index) {
        if (index < 0 || index > array.length) {
            System.out.println("Wrong index");
            return array;
        }
        int[] newArray = new int[array.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index)
                newArray[i] = array[i];
            else if (i >= index)
                newArray[i] = array[i + 1];

        }
        return newArray;
    }
}




import java.util.Arrays;
import java.util.Random;

/**
 * Created by raja on 28.06.17.
 */
public class AddIndex {
    public static void main (String [] args){
        int [] array = new int[10];
        Random random = new Random();
        int length = array.length;
        int value = -5;
        int index = 4;

        for(int i=0; i < array.length; i++){
            array[i]= random.nextInt(50);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Dlina massiva + " + length);

        array=addElementByIndex(array, value, index);
        length = array.length;

        System.out.println(Arrays.toString(array));
        System.out.println("Dlina massiva + " + length);


    }

public static int[] addElementByIndex(int[] array, int value, int index) {
        if (index < 0|| index  > array.length){
            System.out.println("Wrong index");
            return array;
        }
        int [] newArray = new int [array.length+1];
        for(int i = 0; i< newArray.length;i++){
            if(i< index)
                newArray[i] = array[i];
            else if (i == index)
                newArray[i] = value;
            else
                newArray[i] = array[i-1];
        }
    return newArray;
    }

}


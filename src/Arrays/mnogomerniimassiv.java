package Arrays;

import java.util.Arrays;

/**
 * Created by OLEG on 27.06.2017.
 */
public class mnogomerniimassiv {
    public static void main (String[] args){
        String [] fruits = {"Apple","Orange","BANANA","peach"};
        String [] trees = {"oak","willow","chestnut"};
        String [] planets = {"Mercury","Venus","Earth","Mars","Jupiter","Saturn"};
        String [] [] array = {fruits, trees, planets};

        for (int i=0; i< array.length; i++){
            System.out.println(Arrays.toString(array[i]));
        }
    }
}

import java.util.Random;

/**
 * Created by OLEG on 27.06.2017.
 */
public class countRepeat {
    public static void main (String[] args){
        int [] array = new int[20];
        int element = 5;
        int count = 0;
        Random random = new Random();

        for(int i=0; i<array.length; i++){
            array[i]=random.nextInt(10);
            if (array[i] == element) count++;
            System.out.println(" Element " + element + " occurs " + count + " times " );
        }
    }
}

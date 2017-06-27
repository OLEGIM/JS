import java.util.Random;

/**
 * Created by OLEG on 27.06.2017.
 */
public class foreach {
    public static void main (String[] args){
        int[] array = new int [10];
        Random random= new Random();

        for (int item: array){
            item = random.nextInt(20);
            System.out.println(item);
        }
    }

}

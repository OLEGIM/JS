import java.util.Random;

/**
 * Created by OLEG on 23.06.2017.
 */
public class random_massiv {
    public static void main (String[] args){
        int [] array = new int [10];
        Random random = new Random();

        for ( int i=0; i < array.length; i++ ) {
            array[i] = random.nextInt(200);
        }
        for ( int i =0; i < array.length;i++){
            System.out.print(" " + array[i]);

        };
    }
}

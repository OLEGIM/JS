/**
 * Created by OLEG on 27.06.2017.
 */
public class classbreak {
    public static void main (String[] args ){
        int [] array = {127, 55, 89, 77, 78, 33, -4, -35, 65};

        for (int item: array){
            if (item < 0) // выполнять цикл до условия что 0 не будет меньше нуля иначе прекращаем и выводим
                break;
            System.out.println(item);
        }
    }
    }

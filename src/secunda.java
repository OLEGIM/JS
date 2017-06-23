import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/**
 * Created by OLEG on 22.06.2017.
 */
public class secunda {
    public static void main(String[] args) throws IOException{
        System.out.println("Press Enter to Start");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        Date old = new Date();

        System.out.println("Press Enter to Stop");
        str = reader.readLine();
        Date current = new Date();

        long distance = current.getSeconds() - old.getSeconds();
        System.out.println("Time distance is: " + distance + " in sec");
    }
}

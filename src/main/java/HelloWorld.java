import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;

public class HelloWorld {
    public void printMessage(Calendar date)  {

        ResourceBundle myBundle = ResourceBundle.getBundle("HelloWords");

        int hour = date.get(Calendar.HOUR_OF_DAY) + 1;

        try {

            if (hour >= 6 && hour < 9)
                System.out.println(new String(myBundle.getString("good_morning").getBytes("ISO8859-1")));
            else if (hour >= 9 && hour < 19)
                System.out.println(new String(myBundle.getString("good_day").getBytes("ISO8859-1")));
            else if (hour >= 19 && hour < 23)
                System.out.println(new String(myBundle.getString("good_evening").getBytes("ISO8859-1")));
            else
                System.out.println(new String(myBundle.getString("good_night").getBytes("ISO8859-1")));

        } catch (UnsupportedEncodingException e) {
            System.out.println("Sorry. Encoding problems.");
        }
    }

    public static void main(String[] args){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.printMessage(Calendar.getInstance());
    }
}

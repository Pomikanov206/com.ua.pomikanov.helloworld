import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorld {

    private static Logger logger = Logger.getLogger(HelloWorld.class.getName());

    public void printMessage(Calendar date)  {

        ResourceBundle myBundle = ResourceBundle.getBundle("HelloWords");

        int hour = date.get(Calendar.HOUR_OF_DAY) + 1;

        try {
            String resultLine = null;
            if (hour >= 6 && hour < 9)
                resultLine = new String(myBundle.getString("good_morning").getBytes("ISO8859-1"));
            else if (hour >= 9 && hour < 19)
                resultLine = new String(myBundle.getString("good_day").getBytes("ISO8859-1"));
            else if (hour >= 19 && hour < 23)
                resultLine = new String(myBundle.getString("good_evening").getBytes("ISO8859-1"));
            else
                resultLine = new String(myBundle.getString("good_night").getBytes("ISO8859-1"));

            System.out.println(resultLine);
            logger.info(resultLine);

        } catch (UnsupportedEncodingException e) {
            logger.log(Level.WARNING,"Encoding problems.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.printMessage(Calendar.getInstance());
    }
}

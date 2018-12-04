import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.time.LocalTime;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorld {

    private static Logger logger = Logger.getLogger(HelloWorld.class.getName());

    public void printMessage(LocalTime time)  {

        ResourceBundle myBundle = ResourceBundle.getBundle("HelloWords");

        int hour = time.getHour();

        try {
            String resultLine, helloMessage;

            if (hour >= 6 && hour < 9)
                helloMessage = "good_morning";
            else if (hour >= 9 && hour < 19)
                helloMessage = "good_day";
            else if (hour >= 19 && hour < 23)
                helloMessage = "good_evening";
            else
                helloMessage = "good_night";

            resultLine = new String(myBundle.getString(helloMessage).getBytes("ISO8859-1"));
            System.out.println(resultLine);
            logger.info(resultLine + " time:(" + time.toString() + ")");

        } catch (UnsupportedEncodingException e) {
            logger.log(Level.WARNING,"Encoding problems.");
        }
    }

    public static void main(String[] args){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.printMessage(LocalTime.now());
    }
}

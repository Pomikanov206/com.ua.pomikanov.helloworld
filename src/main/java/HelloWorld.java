import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;

public class HelloWorld {
    public void printMessage(Calendar date, Locale locale){

        ResourceBundle myBundle = ResourceBundle.getBundle("hello_world");

        int hour = date.get(Calendar.HOUR_OF_DAY) + 1;
        if(hour >= 6 && hour < 9 )
            System.out.println("Good morning, World!");
        else if(hour >= 9 && hour < 19)
            System.out.println("Good day, World!");
        else if(hour >= 19 && hour < 23)
            System.out.println("Good evening, World!");
        else
            System.out.println("Good night, World!");
    }
    public void printA(){
        System.out.println("A");
    }
    public static void main(String[] args) {

    }
}

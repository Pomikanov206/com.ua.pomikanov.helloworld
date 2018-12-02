import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static junit.framework.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void MorningTestEn() {
        HelloWorld helloWorld = new HelloWorld();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(2018, 12, 3, 7, 0, 0));

        Locale.setDefault(new Locale("en", "US"));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(out);
        System.setOut(printStream);

        helloWorld.printMessage(calendar);

        assertEquals(out.toString(), "Good morning, World!" + System.lineSeparator());
    }

    @Test
    public void MorningTestRu() {
        HelloWorld helloWorld = new HelloWorld();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(2018, 12, 3, 7, 0, 0));

        Locale.setDefault(new Locale("ru", "RU"));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(out);
        System.setOut(printStream);

        helloWorld.printMessage(calendar);

        assertEquals(out.toString(), "Доброе утро, Мир!" + System.lineSeparator());
    }

    @Test
    public void DayTestEn() {
        HelloWorld helloWorld = new HelloWorld();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(2018, 12, 3, 13, 0, 0));

        Locale.setDefault(new Locale("en", "US"));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(out);
        System.setOut(printStream);

        helloWorld.printMessage(calendar);

        assertEquals(out.toString(), "Good day, World!" + System.lineSeparator());
    }

    @Test
    public void DayTestRu() {
        HelloWorld helloWorld = new HelloWorld();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(2018, 12, 3, 13, 0, 0));

        Locale.setDefault(new Locale("ru", "RU"));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(out);
        System.setOut(printStream);

        helloWorld.printMessage(calendar);

        assertEquals(out.toString(), "Добрый день, Мир!" + System.lineSeparator());
    }

    @Test
    public void EveningTestEn(){
        HelloWorld helloWorld = new HelloWorld();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(2018,12,3,20,0,0));

        Locale.setDefault(new Locale("en","US"));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(out);
        System.setOut(printStream);

        helloWorld.printMessage(calendar);

        assertEquals(out.toString(), "Good evening, World!"+System.lineSeparator());
    }
    @Test
    public void EveningTestRu(){
        HelloWorld helloWorld = new HelloWorld();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(2018,12,3,20,0,0));

        Locale.setDefault(new Locale("ru","RU"));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(out);
        System.setOut(printStream);

        helloWorld.printMessage(calendar);

        assertEquals(out.toString(), "Добрый вечер, Мир!"+System.lineSeparator());
    }

    @Test
    public void NightTestEn(){
        HelloWorld helloWorld = new HelloWorld();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(2018,12,3,2,0,0));

        Locale.setDefault(new Locale("en","US"));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(out);
        System.setOut(printStream);

        helloWorld.printMessage(calendar);

        assertEquals(out.toString(), "Good night, World!"+System.lineSeparator());
    }
    @Test
    public void NightTestRu(){
        HelloWorld helloWorld = new HelloWorld();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(2018,12,3,2,0,0));

        Locale.setDefault(new Locale("ru","RU"));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(out);
        System.setOut(printStream);

        helloWorld.printMessage(calendar);

        assertEquals(out.toString(), "Доброй ночи, Мир!"+System.lineSeparator());
    }

}
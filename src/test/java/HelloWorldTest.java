import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static junit.framework.Assert.assertEquals;

public class HelloWorldTest {
    public static String getMessage(LocalTime time){
        HelloWorld helloWorld = new HelloWorld();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(out);
        System.setOut(printStream);

        helloWorld.printMessage(time);

        String result = out.toString();

        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    @Test
    public void MorningTestEn() {
        Locale.setDefault(new Locale("en", "US"));

        for (int i = 6; i < 9; i++) {
            for (int j = 0; j < 60; j++) {
                LocalTime time = LocalTime.of(i, j);
                String message = getMessage(time);
                Assert.assertEquals(message,"Good morning, World!" + System.lineSeparator());
            }
        }
    }
    @Test
    public void MorningFailTestEn() {
        Locale.setDefault(new Locale("en", "US"));

        LocalTime time = LocalTime.of(5, 59);
        String message = getMessage(time);
        Assert.assertNotEquals(message,"Good morning, World!" + System.lineSeparator());

        time = LocalTime.of(9, 0);
        message = getMessage(time);
        Assert.assertNotEquals(message,"Good morning, World!" + System.lineSeparator());
    }

    @Test
    public void MorningTestRu() {
        Locale.setDefault(new Locale("ru", "RU"));

        for (int i = 6; i < 9; i++) {
            for (int j = 0; j < 60; j++) {
                LocalTime time = LocalTime.of(i, j);
                String message = getMessage(time);
                assertEquals(message, "Доброе утро, Мир!" + System.lineSeparator());
            }
        }

    }
    @Test
    public void MorningFailTestRu() {
        Locale.setDefault(new Locale("en", "US"));

        LocalTime time = LocalTime.of(5, 59);
        String message = getMessage(time);
        Assert.assertNotEquals(message,"Доброе утро, Мир!" + System.lineSeparator());

        time = LocalTime.of(9, 0);
        message = getMessage(time);
        Assert.assertNotEquals(message,"Доброе утро, Мир!" + System.lineSeparator());
    }


    @Test
    public void DayTestEn() {
        Locale.setDefault(new Locale("en", "US"));

        for (int i = 9; i < 19; i++) {
            for (int j = 0; j < 60; j++) {
                LocalTime time = LocalTime.of(i, j);
                String message = getMessage(time);
                Assert.assertEquals(message,"Good day, World!" + System.lineSeparator());
            }
        }
    }
    @Test
    public void DayFailTestEn() {
        Locale.setDefault(new Locale("en", "US"));

        LocalTime time = LocalTime.of(5, 59);
        String message = getMessage(time);
        Assert.assertNotEquals(message,"Good day, World!" + System.lineSeparator());

        time = LocalTime.of(19, 0);
        message = getMessage(time);
        Assert.assertNotEquals(message,"Good day, World!" + System.lineSeparator());
    }
    @Test
    public void DayTestRu() {
        Locale.setDefault(new Locale("ru", "RU"));

        for (int i = 9; i < 19; i++) {
            for (int j = 0; j < 60; j++) {
                LocalTime time = LocalTime.of(i, j);
                String message = getMessage(time);
                Assert.assertEquals(message,"Добрый день, Мир!" + System.lineSeparator());
            }
        }
    }
    @Test
    public void DayFailTestRu() {
        Locale.setDefault(new Locale("en", "US"));

        LocalTime time = LocalTime.of(5, 59);
        String message = getMessage(time);
        Assert.assertNotEquals(message,"Добрый день, Мир!" + System.lineSeparator());

        time = LocalTime.of(19, 0);
        message = getMessage(time);
        Assert.assertNotEquals(message,"Добрый день, Мир!" + System.lineSeparator());
    }

    @Test
    public void EveningTestEn(){
        Locale.setDefault(new Locale("en", "US"));

        for (int i = 19; i < 23; i++) {
            for (int j = 0; j < 60; j++) {
                LocalTime time = LocalTime.of(i, j);
                String message = getMessage(time);
                Assert.assertEquals(message,"Good evening, World!" + System.lineSeparator());
            }
        }
    }
    @Test
    public void EveningFailTestEn() {
        Locale.setDefault(new Locale("en", "US"));

        LocalTime time = LocalTime.of(5, 59);
        String message = getMessage(time);
        Assert.assertNotEquals(message,"Good evening, World!" + System.lineSeparator());

        time = LocalTime.of(9, 0);
        message = getMessage(time);
        Assert.assertNotEquals(message,"Good evening, World!" + System.lineSeparator());
    }
    @Test
    public void EveningTestRu(){
        Locale.setDefault(new Locale("ru", "RU"));

        for (int i = 19; i < 23; i++) {
            for (int j = 0; j < 60; j++) {
                LocalTime time = LocalTime.of(i, j);
                String message = getMessage(time);
                Assert.assertEquals(message,"Добрый вечер, Мир!" + System.lineSeparator());
            }
        }
    }
    @Test
    public void EveningFailTestRu() {
        Locale.setDefault(new Locale("en", "US"));

        LocalTime time = LocalTime.of(5, 59);
        String message = getMessage(time);
        Assert.assertNotEquals(message,"Добрый вечер, Мир!" + System.lineSeparator());

        time = LocalTime.of(9, 0);
        message = getMessage(time);
        Assert.assertNotEquals(message,"Добрый вечер, Мир!" + System.lineSeparator());
    }

    @Test
    public void NightTestEn(){
        Locale.setDefault(new Locale("en", "US"));

        for (int i = 23; i < 6 || i == 23; i++) {
            for (int j = 0; j < 60; j++) {
                LocalTime time = LocalTime.of(i, j);
                String message = getMessage(time);
                Assert.assertEquals(message,"Good night, World!" + System.lineSeparator());
            }
            if(i == 23)
                i = -1;
        }
    }
    @Test
    public void NightFailTestEn() {
        Locale.setDefault(new Locale("en", "US"));

        LocalTime time = LocalTime.of(6, 0);
        String message = getMessage(time);
        Assert.assertNotEquals(message,"Good night, World!" + System.lineSeparator());

        time = LocalTime.of(20, 0);
        message = getMessage(time);
        Assert.assertNotEquals(message,"Good night, World!" + System.lineSeparator());
    }
    @Test
    public void NightTestRu(){
        Locale.setDefault(new Locale("ru", "RU"));

        for (int i = 23; i < 6 || i == 23; i++) {
            for (int j = 0; j < 60; j++) {
                LocalTime time = LocalTime.of(i, j);
                String message = getMessage(time);
                Assert.assertEquals(message,"Доброй ночи, Мир!" + System.lineSeparator());
            }
            if(i == 23)
                i = -1;
        }
    }
    @Test
    public void NightFailTestRu() {
        Locale.setDefault(new Locale("en", "US"));

        LocalTime time = LocalTime.of(6, 0);
        String message = getMessage(time);
        Assert.assertNotEquals(message,"Доброй ночи, Мир!" + System.lineSeparator());

        time = LocalTime.of(20, 0);
        message = getMessage(time);
        Assert.assertNotEquals(message,"Доброй ночи, Мир!" + System.lineSeparator());
    }

}
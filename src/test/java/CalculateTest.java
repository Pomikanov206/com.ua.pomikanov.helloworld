import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.Assert.*;

public class CalculateTest {
    @Test
    public void testCalA() throws Exception {
        HelloWorld calculate = new HelloWorld();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(out);
        System.setOut(printStream);
        calculate.printA();
        assertEquals(out.toString(), "A"+System.lineSeparator());
    }
}

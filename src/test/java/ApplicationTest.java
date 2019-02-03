import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplicationTest {

    public static Application app = new Application();

    @Test
    public void main() {
        assertEquals("Hello World!", app.main("Hello World!"));
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {
    @Test
    public void case01(){
        Hello hello = new Hello();
        String msg = hello.sayHi("Ton");
        assertEquals("Hello Ton",msg);
    }
}

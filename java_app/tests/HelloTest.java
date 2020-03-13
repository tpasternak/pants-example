package tests;
import org.junit.Test;
import static org.junit.Assert.*;
/* Ensure our greetings are polite */
public class HelloTest {
  @Test
  public void helloTest() {
      String value=System.getProperty("name");
      assertEquals("name5511", value);

      String value2=System.getProperty("name2");
      assertEquals("name23", value2);
  }
}

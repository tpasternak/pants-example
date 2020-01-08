package tests
import org.junit.Test
import org.junit.Assert._

/* Ensure our greetings are polite */
class HelloTest {
  @Test
  def helloTest() = {
      val value=System.getProperty("name");
      assertEquals("name5511", value);

      val value2=System.getProperty("name2");
      assertEquals("name23", value2);


  }
}

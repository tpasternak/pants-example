package tests;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.io.Console;
import java.util.List;


import static org.junit.Assert.*;
// Dummy comment
public class HelloTest {
  @Test
  public void helloTest() {
      String value = System.getProperty("name");
      assertEquals("name5511", value);

      String value2 = System.getProperty("name2");
      assertEquals("namonetonete23", value2);

  }
}

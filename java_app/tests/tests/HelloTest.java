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

      List<Integer> numbers = Lists.newArrayList(1, 2, 3, 6, 10, 34, 57, 89);
      Function<Integer, Boolean> acceptEven = new Function<>() {
          @Override
          public Boolean apply(Integer number) {
              return (number % 2) == 0;
          }
      };
      Runnable c = new Runnable() {
          @Override
          public void run() {
              System.out.println("ss");
          }
      };
      // List<Integer> evenNumbers = Lists.newArrayList(Collections2.filter(numbers, acceptEven));
      // Integer found = Collections.binarySearch(evenNumbers, 57);
  }
}

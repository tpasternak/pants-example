package tests;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
/* Ensure our greetings are polite */
public class HelloTest {
  @Test
  public void helloTest() {
      String value = System.getProperty("name");
      assertEquals("name5511", value);

      String value2 = System.getProperty("name2");
      assertEquals("namonetonete23", value2);


      List<Integer> numbers = Lists.newArrayList(1, 2, 3, 6, 10, 34, 57, 89);
      Function<Integer, Boolean> acceptEven = new Function<Integer, Boolean>() {
          @Override
          public Boolean apply(Integer number) {
              return (number % 2) == 0;
          }
      };
      //List<Integer> evenNumbers = Lists.newArrayList(Collections2.filter(numbers, acceptEven));
      //Integer found = Collections.binarySearch(evenNumbers, 57);

  }
}

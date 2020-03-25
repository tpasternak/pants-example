import junit.framework.TestSuite
import org.junit.Test

class A extends TestSuite {
  @Test
  def t = {
    println("Hello!!!")
  }
}
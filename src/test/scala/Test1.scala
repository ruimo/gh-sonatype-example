import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class Test1 extends AnyFlatSpec with should.Matchers {
  it should "Message is valid." in {
    Main.msg === "Hello, World!"
  }
}

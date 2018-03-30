import org.scalatest.FlatSpec

class ArgLeafSpec extends FlatSpec {

  "ArgLeaf" should "parse a flag" in {
    val args = new ArgLeaf(Array("-i"))
    assert(args != null)
  }
}

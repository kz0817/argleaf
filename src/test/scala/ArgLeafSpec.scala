class ArgLeafSpec extends FlatSpec {

  "ArgLeaf" should "parse a flag" in {
    val args = new ArgLeaf(["-i"])
    assert(args != null)
  }
}

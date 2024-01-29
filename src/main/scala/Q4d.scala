object Q4d {
  def main(args: Array[String]): Unit = {
    val i: Int = 10
    if (i % 2 == 0) {
      val r = i % 3
      println(s"$i is even When it is divided by 3 the remainder is $r")
    } else {

      println(s"$i is odd")
    }
  }
}



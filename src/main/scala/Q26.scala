object Q26 {
  def main(args: Array[String]): Unit = {
    print(1, 35)
  }
  def print(a: Int, b: Int): Unit = {
    for (i <- a to b by 2) {
      println(i)
      if (i < b - 1) {
        println("even")
      }
    }
  }
}



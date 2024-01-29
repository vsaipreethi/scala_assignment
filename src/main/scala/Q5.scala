object Q5 {
  def main(args: Array[String]): Unit = {
    val num=23
    if(num>=0 && num<=100) {
      if (num >= 90 && num <= 100) {
        println("super smart")
      } else if (num >= 80 && num < 90) {
        println("smart")
      } else if (num >= 70 && num < 80) {
        println("smart enough")
      } else if (num >= 60 && num < 70) {
        println("just smart")
      } else if (num >= 35 && num < 60) {
        println("no smart")
      } else {
        println("dump")
      }
    } else {
      println( "invalid input num should be in the range 0-100")
    }

  }



}

object Q9 {
  def main(args: Array[String]): Unit = {
    val a1 = 56
    val a2 = 153
    val sum = calsum(a1, a2)
    println(s"The sum of num from $a1 to $a2 is: $sum")}
  def calsum(a1:Int, a2:Int):Int = {
    (a1 to a2)sum
  }
}

object PascalTriangle {
  def main(args: Array[String]) {
    val N = scala.io.StdIn.readInt()

    def factorial(num: Int) = (1 to num).product

    for (n <- 0 until N) {
      println(factorial(5))
      for (r <- 0 to N) {
        if (r <= n) {
          val x = factorial(n) / (factorial(r) * factorial(n - r))
          print(s"$x ")
        }
      }
      print("\n")
    }

  }
}

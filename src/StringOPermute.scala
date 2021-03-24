object StringOPermute {
  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution*/
    def swapTheChar(swapTheTwo: String): String = {
      val swapResult = swapTheTwo.grouped(2).toList.map(x => x.reverse).mkString
      swapResult
    }

    val stdin = scala.io.StdIn
    val testCase = stdin.readLine().trim().toInt
    for (a <- 1 to testCase) {
      val inputData = stdin.readLine().trim()
      println(swapTheChar(inputData))
    }
  }
}

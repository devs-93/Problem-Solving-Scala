object FilterElements {
  def main(args: Array[String]) {
    val StdIn = scala.io.StdIn
    val n = StdIn.readInt()
    for (i <- 0 until n) {
      val args = StdIn.readLine().split(" ")
      val numberArray = StdIn.readLine().split(" ").map(x => x.toInt)
      val result = filterAtLeastFunction(args(1).toInt, numberArray)
      println(if (!result.isEmpty) result.mkString(" ") else -1)
    }
  }

  def filterAtLeastFunction(atLeast: Int, numElement: Array[Int]) = {
    val result = numElement.groupBy(x => x).map(x => (x._1, x._2.length))
    val data = numElement.distinct.map(x => if (result(x) >= atLeast) x else -1).filter(x => (x != -1))
    data
  }
}

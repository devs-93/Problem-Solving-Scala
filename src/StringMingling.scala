object StringMingling {
  def main(args: Array[String])
  {
    val stdin = scala.io.StdIn
    val firstString = stdin.readLine().trim()
    val secondString = stdin.readLine().trim()
    val zippedData = firstString.toList zip secondString.toList
    val result = zippedData.flatten(x => x._1.toString.concat(x._2.toString))
    println(result.mkString(""))
  }
}

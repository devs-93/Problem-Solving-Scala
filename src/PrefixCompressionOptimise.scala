object PrefixCompressionOptimise {
  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
    val stdin = scala.io.StdIn
    val x = stdin.readLine().trim()
    val y = stdin.readLine().trim()

    val (cm, xp, yp) = applyCompress(x, y)
    println(cm.length + " " + cm)
    println(xp.length + " " + xp)
    println(yp.length + " " + yp)

  }

  def applyCompress(firstString: String, secondString: String): (String, String, String) = {
    val zippedString = firstString.zip(secondString)
    val commonCharInString = zippedString.takeWhile {
      case (firstChar, secondChar) => (firstChar == secondChar)
    }


    val commonStringSet = commonCharInString.map(x => x._1).mkString("")


    val commonSize = commonStringSet.length
    (commonStringSet, firstString.drop(commonSize), secondString.drop(commonSize))
  }
}

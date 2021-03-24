object PrefixCompression {
  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution*/
    val stdin = scala.io.StdIn
    val firstString = stdin.readLine().trim()
    val secondString = stdin.readLine().trim()

    def stringMatch(firstString: String, secondString: String, matchedString: String): (String, String, String) = {
      if (firstString.isEmpty || secondString.isEmpty) {
        (firstString, secondString, matchedString)
      }
      else {
        if ((firstString.head == secondString.head) && (firstString.nonEmpty && secondString.nonEmpty)) {
          stringMatch(firstString.tail, secondString.tail, matchedString + firstString.head)
        }
        else {
          (firstString, secondString, matchedString)
        }
      }
    }

    val result = stringMatch(firstString, secondString, "")
    println(result._3.length + " " + result._3)
    println(result._1.length + " " + result._1)
    println(result._2.length + " " + result._2)

  }
}

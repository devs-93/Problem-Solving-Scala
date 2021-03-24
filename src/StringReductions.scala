object StringReductions {
  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution*/
    val stdin = scala.io.StdIn
    val inputData = stdin.readLine().trim()


    def stringReductionFunction(stringToReduce: String, reducedString: String): String = {
      if (stringToReduce.isEmpty)
      {
        reducedString
      }
      else if (reducedString.contains(stringToReduce.head))
      {
        stringReductionFunction(stringToReduce.tail, reducedString)
      }
      else {
        stringReductionFunction(stringToReduce.tail, reducedString + stringToReduce.head)
      }
    }
    println(stringReductionFunction(inputData, ""))
  }
}

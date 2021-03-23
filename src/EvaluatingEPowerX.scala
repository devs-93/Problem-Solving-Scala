

object EvaluatingEPowerX extends App {
  val stdin = scala.io.StdIn
  val n = stdin.readLine.trim.toInt

  def evaluatingFunction(data: Double): Double = {
    def factorial(n: Int): Int = {
      if (n == 0)
        return 1
      else
        return n * factorial(n - 1)
    }

    var count: Double = 0
    var result: Double = 0
    while (count != 10.00) {
      val expressionEvaluation = Math.pow(data, count) / factorial(count.toInt)
      result = result + expressionEvaluation
      count = count + 1
    }
    return result
  }

  for (nItr <- 1 to n) {
    val x = stdin.readLine.trim.toDouble
    import java.text.DecimalFormat
    val df = new DecimalFormat(".####")
    println(df.format(evaluatingFunction(x)))
  }
}


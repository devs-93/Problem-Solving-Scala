object FibonacciNumbers {
  def fibonacci(x: Int): Int = {
    //    println(x)
    if (x == 1) {
      return 0
    }
    else if (x == 2 || x == 3) {
      return 1
    }
    else {
      fibonacci(x - 1) + fibonacci(x - 2)
    }
  }

  def main(args: Array[String]) {
    /** This will handle the input and output* */
    println(fibonacci(readInt()))
  }
}


object StringCompression {
  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution*/
    val stdin = scala.io.StdIn
    val stringToCompress = stdin.readLine().trim()
    println ("(\\w)\\1+".r.replaceAllIn (stringToCompress, m => "$1" + m.toString.length));
  }
}

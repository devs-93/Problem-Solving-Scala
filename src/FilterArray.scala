object FilterArray extends App {
  def f(delim: Int, arr: List[Int]): List[Int] = {
    val filteredArrayList = arr.filter(x => (x < delim))
    filteredArrayList
  }

  println(f(7, List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
}

object FilterPositionsList extends App {
  def f(arr: List[Int]):List[Int] = {
    val filterPositionsList = arr.zipWithIndex
    val oddDataList = filterPositionsList.filter(x => (x._2 % 2 != 0)).map(x=>x._1)
    oddDataList
  }
  println(f(List(1, 2, 3, 4, 5, 6, 7, 8, 9)))
}

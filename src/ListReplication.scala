object ListReplication extends App {
  def f(repeatCount: Int, arr: List[Int]) = {
    val resultList = arr.map(e => List.fill(repeatCount)(e))
    resultList.flatten
  }
}

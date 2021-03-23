object SumOfOddElements extends App {
  def f(arr: List[Int]): Int = {
    val oddDataList = arr.filter(x => x % 2 != 0)
    oddDataList.sum
  }
  println(f(List(1,2,3,4,5,6,7,8,9)))
}

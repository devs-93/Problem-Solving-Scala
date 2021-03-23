object UpdateList extends App {
  def f(arr: List[Int]): List[Int] = {
    val result = arr.map(x => if (x < 0) x.abs else x)
    result
  }
  println(f(List(1,2,3,4,5,-4,-98)))
}

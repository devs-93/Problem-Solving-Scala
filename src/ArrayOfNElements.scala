object ArrayOfNElements extends App {
  def f(num: Int): List[Int] = {
      val list = List.range(0, num)
      return list
  }
  println(f(3))
}

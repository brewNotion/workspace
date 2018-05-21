package TrueFit

object MergeSort extends App {

  def mergeSort(ar: Array[Int]): Array[Int] = {
    var n = ar.length / 2
    if (n == 0) ar
    else {
      val (left, right) = ar.splitAt(n)
      merge(mergeSort(left), mergeSort(right))
    }
  }

  def merge(xs: Array[Int], ys: Array[Int]): Array[Int] = (xs, ys) match {
    case (xs, ys) if xs.length == 0 => ys
    case (xs, ys) if ys.length == 0 => xs
    case (Array(x, restx@_*), Array(y, resty@_*)) =>
      if (x < y) x +: merge(restx.toArray, ys)
      else y +: merge(xs, resty.toArray)
  }

  val sortedArray = mergeSort(Array(5, 3, 1, 2, 4));
  sortedArray.foreach(x => print(x + " "))

  def mergeSort(l: List[Int]): List[Int] = {
    val n = l.length / 2
    if (n == 0) l
    else {
      def merge(ll: List[Int], lr: List[Int]): List[Int] = (ll, lr) match {
        case (Nil, lrt) => lrt
        case (llt, Nil) => llt
        case (x :: llt, y :: lrt) =>
          if (x < y) x :: merge(llt, lr)
          else y :: merge(ll, lrt)
      }

      val (left, right) = l.splitAt(n)
      merge(mergeSort(left), mergeSort(right))
    }
  }

  val sortedList = mergeSort(Array(5, 3, 1, 2, 4));
  sortedList.foreach(x => print(x + " "))
}

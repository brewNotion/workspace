package TrueFit

object QuickSort extends App{

  def sort(arr:Array[Int]):Array[Int] = {
    if(arr.length<2)arr
    else {
      val pivot = arr(arr.length/2)
      sort( arr filter(pivot>)) ++ arr.filter(pivot==) ++ sort(arr filter(pivot<))
    }
  }
  val sorted = sort(Array(5,3,1,2,4));
  sorted.foreach(x => print(x+ " "))
}

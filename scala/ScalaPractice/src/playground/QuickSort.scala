package playground

object QuickSort extends App{

  def sort(ar:Array[Int]): Array[Int] = {
    if(ar.length<2)ar
    else{
      val pivot = ar(ar.length/2);
      sort(ar filter (pivot>)) ++ (ar filter (pivot==)) ++ sort(ar filter (pivot<))
    }
  }

  val sorted = sort(Array(5,3,1,2,4));
  sorted.foreach(x => print(x+ " "))
}

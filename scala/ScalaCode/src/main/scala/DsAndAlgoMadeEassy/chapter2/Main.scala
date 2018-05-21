package DsAndAlgoMadeEassy.chapter2

import scala.collection.mutable.ListBuffer

object Main extends App{

  def TowersToHanoi(F:String,T:String,A:String)(n:Int): Unit = {
    if(n < 1)return
    if(n < 2)
      println(F +" -> "+T)
    else {
      TowersToHanoi(F, A, T)(n - 1)
      println(F + " -> " + T)
      TowersToHanoi(A, T, F)(n - 1)
    }
  }

  var toi = TowersToHanoi("From","To","Aux")_
  toi(2)

}

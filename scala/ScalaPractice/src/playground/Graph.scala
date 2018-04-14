package playground

import scala.collection.mutable.ListBuffer


class Graph(E:Int, V:Int) {
  val adjList = new Array[ListBuffer[Int]](V+1);

  for(i <- 0 to V){
    adjList(i) = new ListBuffer[Int]
  }

  def connect(from:Int, to:Int): Unit = {
    //adjList(from).app
  }
}

object Graph {


  //var v = ListBuffer[Int]
    //v.push
  def apply(E: Int, V: Int): Graph = new Graph(E, V)
}
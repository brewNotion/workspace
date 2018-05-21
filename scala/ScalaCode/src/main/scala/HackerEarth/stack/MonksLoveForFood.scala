package HackerEarth.stack

/*class MonksLoveForFood {

}*/

import scala.io.StdIn._

object MonksLoveForFood {
  def main(args: Array[String]) {

    var Q: Int = readInt();
    var st: List[Int] = Nil

    while (Q > 0) {
      Q = Q - 1
      val A: List[Int] = readLine().split(" ").toList.map(_.toInt)
      A.length match {
        case 1 => st match {
          case Nil => println("No Food")
          case _ => {
            println(st.head)
            st = st.tail
          }
        }
        case 2 =>  st = A(1) :: st
      }
    }
  }

    // using mutable stack
    /*def main(args: Array[String]) {

      var Q: Int = readInt();
      val st: Stack[Int] = Stack[Int]()

      while (Q > 0) {
        Q = Q - 1
        val A: List[Int] = readLine().split(" ").toList.map(_.toInt)
        A.length match {
          case 1 if st.isEmpty => println("No Food")
          case 1 => println(st.pop)
          case 2 => st push A(1)
        }
      }
    }*/
}
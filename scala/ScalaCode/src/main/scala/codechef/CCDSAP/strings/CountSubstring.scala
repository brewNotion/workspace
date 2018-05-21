package codechef.CCDSAP.strings

// https://www.codechef.com/problems/CSUB
object CountSubstring extends App{

  import scala.io.StdIn._

  var T = readLine().toInt
  while(T>0){
    readLine()
    val count1s = readLine().foldLeft(0)((z,e) => z+(if(e=='1') 1 else 0) )
    println(((count1s-1)/2)*count1s)
    T -= 1
  }
  import java.lang.String
}

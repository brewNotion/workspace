package HackerEarth.codemonk.basicprogramming.io

/*https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/prime-number-8/description*/
import scala.io.StdIn._
object PrimeNumber extends App{
  val N = readInt()
  var buff = Array.fill[Boolean](N+1)(true)
  for(i <- 2 to N/2){
    if(buff(i)){
      print(i+" ")
      for( j <- 2*i to N by i)
        buff(j) = false
    }
  }
}

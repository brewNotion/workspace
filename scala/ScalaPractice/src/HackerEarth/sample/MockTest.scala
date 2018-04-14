package HackerEarth.sample
import scala.annotation.tailrec
import scala.io.StdIn._
object MockTest extends App{
  commonFactors
  def commonFactors {

    val nums = readLine().split(" ").map(_.toLong)
    val (a,b) = (nums(0),nums(1))
    var count:Long = 1
    val step = if(a%2==0 && b%2==0) 1 else 2
    var i = 3l
    while(i <= GCD(a,b)){
      if(a%i==0 && b%i==0)count += 1
      i += step
    }
    println(count)
  }

  @tailrec
  def GCD(a:Long, b:Long): Long = {
    if(b==0)return a
    else
      GCD(b,a%b)
  }
}

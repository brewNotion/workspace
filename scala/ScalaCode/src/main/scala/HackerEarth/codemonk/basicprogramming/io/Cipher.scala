package HackerEarth.codemonk.basicprogramming.io

//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/cipher-1/

import scala.io.StdIn._
object Cipher {
  def main(args: Array[String]): Unit = {
    val s = readLine
    val jump = readLine.toInt
    for(c <- s){
      val cn = c match {
        case ci if ci>= '0' && ci <= '9' => 48 + ((ci + jump%10)%48)%10
        case ci if ci>= 'a' && ci <= 'z' => 97 + ((ci + jump%26)%97)%26
        case ci if ci>= 'A' && ci <= 'Z' => 65 + ((ci + jump%26)%65)%26
        case ci => ci
      }
      print(cn.toChar)
    }
  }
}

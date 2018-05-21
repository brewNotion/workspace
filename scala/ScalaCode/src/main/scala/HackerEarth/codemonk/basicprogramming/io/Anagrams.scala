package HackerEarth.codemonk.basicprogramming.io

//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/anagrams-651/
import scala.io.StdIn._
object Anagrams extends App{

  var T = readInt();
  while (T>0){
    val buff = Array.fill[Int](26)(0)
    readLine().toLowerCase().foreach(c => buff(c-'a')+=1)
    readLine().toLowerCase().foreach(c => buff(c-'a')-=1)
    println(buff.map(Math.abs).sum)
    T -= 1
  }
}

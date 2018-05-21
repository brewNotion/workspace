package HackerRank.FunctionalProgramming
import io.StdIn
import io.Source
import scala.collection.mutable.ListBuffer
object SolveMeFirstFP{

  def main(args: Array[String]) {

    //Source.stdin.getLines().take(2) // returns Iterator[String]
    //println(Source.stdin.getLines().take(2).map(_.toInt).sum)

    //println(StdIn.readLine().trim.toInt + StdIn.readLine().trim.toInt)

    val l = listReplication(3,List(1,2,3))
    l.foreach(print)
    println(" reverse of linked list ")
    println(reverseList(List(9,8,7)))
    println("sum of odds "+List(1,2,3,4,5,6,7))
    println(sumOfOdds(List(1,2,3,4,5,6,7)))
    println("list Length Func "+List(1,2,3,4,5,6,7))
    println(listLengthFunc(List(1,2,3,4,5,6,7)))
  }

  def listReplication(n:Int, arr:List[Int]): List[Int] = {
    var lb = new ListBuffer[Int]

    arr.foreach( e =>
      for(_ <- 1 to n)
        lb += e
    )

    lb.toList
  }

  def filterWithDelimeter(delim:Int, arr:List[Int]): List[Int] = {
    val lb = new scala.collection.mutable.ListBuffer[Int]
    for(e <- arr if e<delim) lb+= e
    lb.toList

    arr.filter(_ < delim)
  }

  def filterOddIndex(arr:List[Int]):List[Int] = {
    val lb = new scala.collection.mutable.ListBuffer[Int]
    var i = 1;
    for(e <- arr if i%2==0) {
      lb+= e
      i+=1
    }
    lb.toList
  }

  def filterOddIndex2(arr:List[Int]):List[Int] = arr match {
    case odd::Nil => Nil
    case odd::even::Nil => even::Nil
    case odd::even::tail => even::filterOddIndex2(tail)
    case _ => Nil
  }
  def reverseList(arr:List[Int]):List[Any] = arr match {
    case head::tail => reverseList(tail):::List(head)
    case _ => Nil
  }
  def reverseList2(arr:List[Int]):List[Int] =
    if(arr.size==1) List(arr.head)
    else reverseList2(arr.tail):::List(arr.head)

  def reverseList3(arr:List[Int]):List[Int] = {
    arr.foldLeft(List[Int]())((acc, e) => e :: acc)
    //arr.reverse
    //arr.foldRight(List[Int]())((e, acc) => e :: acc)
    (List[Int]() /: arr) ((acc, e) => e :: acc)
    //(arr :\ List[Int]()) (_ :: _)
  }

  def sumOfOdds(arr:List[Int]):Int = arr.foldLeft(0)((acc,e) => acc + {if(e%2==0) 0 else e})

  def listLengthProcedural(arr:List[Int]):Int = arr.length

  def listLengthFunc(arr:List[Int]):Int = {
    def aux(l:List[Int],len:Int):Int = l match {
      case Nil => 0
      case _::Nil => len+1
      case head::tail => aux(tail,len+1)

    }
    aux(arr,0)
  }
}

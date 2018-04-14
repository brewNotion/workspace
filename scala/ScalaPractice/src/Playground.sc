import scala.collection.mutable.ListBuffer

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

val arr = List(1,2,3,4,5)
var lb = new scala.collection.mutable.ListBuffer[Int]
var i = 1;
for(e <- arr) {
  if(i%2==0) lb+=e
  i+=1
}
lb.toList

def filterOddPosition(arr:List[Int]):List[Int] = arr match {
  case odd::Nil => Nil
  case odd::even::Nil => even::Nil
  case odd::even::tail => even::filterOddPosition(tail)
  case Nil => Nil
}

List.fill(3){1}

arr.foldLeft(List[Int]())( (acc,e) => e::acc)
arr.reverse
arr.foldRight(List[Int]())( (e,acc) => e::acc)
(List[Int]() /: arr)((acc,e)=>e::acc)
(arr :\ List[Int]())(_::_)

val facto = new Array[Int](11)
facto(0) = 1
for(i <- 1 to 10)
  facto(i) = facto(i-1)*i
facto.length
facto(10)


var ran = "two plus two is four".split(" ")
var msg = "two plus four two is".split(" ")

ran.diff(msg).length

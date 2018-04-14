import scala.annotation.tailrec

//***************************
//Problem 1 - get the last element of a list
//***************************

val l_p1 = List.range(1,10)
l_p1.last

@tailrec
def myLast_p1[T](l:List[T]):T = l match {
  case h :: Nil => h
  case _ :: tail => myLast_p1(tail)
  case _ => throw new NoSuchElementException
}
myLast_p1(l_p1)


//***************************
//Problem 2 - Find the last but one element of a list
//***************************

// 2nd last
//The exit case is when the list is composed by a head
//element and a tail made by a list of one single element.
def penultimate_p2[T](l:List[T]):T = l match {
  case h :: List(t) => h // exit case
  case _ :: tail => penultimate_p2(tail)
  case _ => throw new NoSuchElementException
}
var l_p2 = List.range(1,10)
penultimate_p2(l_p2)
l_p2.init.last

def penultimate1_p2[T](n:Int, l:List[T]):T = {
  if (n<=0) throw new IllegalArgumentException
  if (n>=l.length) throw new NoSuchElementException
  l.takeRight(n).head
}

def penultimate2_p2[T](n:Int, l:List[T]):T = l match {
  case tail if(tail.length==n) => tail.head // exit case
  case _ :: tail => penultimate_p2(tail)
  case _ => throw new NoSuchElementException
}


//***************************
// Problem 3 - Find the Kth element of a list. By convention, the first element in the list is element 0.
//***************************

val k = 3
val l_p3 = List.range(1,10)

l_p3(k)


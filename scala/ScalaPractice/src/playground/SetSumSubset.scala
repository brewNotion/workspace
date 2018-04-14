package playground

trait SetSumSubset {
  def hasSubset(set: Array[Int], sum: Int): Boolean
}

class RecursiveSolution extends SetSumSubset {
  override def hasSubset(set: Array[Int], sum: Int): Boolean = {
    def aux(n:Int, sum: Int):Boolean = {
      if(sum==0) true
      else if(sum!=0 && n<0) false
      else aux(n-1,sum) || aux(n-1,sum - set(n))
    }
    aux(set.length-1,sum)
  }
}

class DynamicProgrammingSol extends SetSumSubset {
  override def hasSubset(set: Array[Int], sum: Int): Boolean = {
    val n = set.length
    val lookUp = Array.ofDim[Boolean](n+1, sum+1)

    //var i:Int = 0
    for(i <- 0 to n)
      lookUp(i)(0) = true

    for(row <- 1 to n) {
      for(col <- 1 to sum){
        lookUp(row)(col) = if(col<set(row-1))lookUp(row-1)(col)
        else if(lookUp(row-1)(col)) true
        else lookUp(row-1)(col-set(row-1))
      }
    }
    //print("i is "+i)
    for(row <- 0 to n) {
      for (col <- 0 to sum)
        print(lookUp(row)(col) + " ")
      println()
    }

    lookUp(n)(sum)
  }
}
object SetSumSubsetDriver extends App{

  var set = Array(3, 34, 4, 12, 5, 2)
  //set = Array(2, 10, 8, 7, 3)
  var sum = 9
  //sum = 11
  var sol:Any = None;
  //sol = new RecursiveSolution hasSubset(set,sum)
  sol = new DynamicProgrammingSol hasSubset(set,sum)

  println(sol)
}

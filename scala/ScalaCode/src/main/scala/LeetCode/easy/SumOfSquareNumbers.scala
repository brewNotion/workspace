package LeetCode.easy



class TreeNode(var _value: Int, var _left:TreeNode, var _right:TreeNode ) {
  var value: Int = _value
  var left: TreeNode = _left
  var right: TreeNode = _right
}

object SumOfSquareNumbers extends App{
  def judgeSquareSum(c: Int): Boolean = {
    var b = 0d;
    for(a <- 1 to Math.sqrt(c-1).toInt){
      b = Math.sqrt(c - a*a)
      if(b - Math.round(b) == 0){
        println(a+" "+b)
        return true
      }
    }
    false
  }
  println("judgeSquareSum "+judgeSquareSum(52))

  def checkPossibility(nums: Array[Int]): Boolean = {
    var count = 0
    for( i <- 0 until nums.length-1){
      count = if(nums(i) > nums(i+1)) count + 1 else count
      if(count>1)return false
    }
    true
  }
  println("checkPossibility "+checkPossibility(Array(4,2,2,1)))



  import scala.collection.mutable._
  def averageOfLevels(root: TreeNode): Array[Double] = {

    val q = Queue(root, null)
    val result = ArrayBuffer[Double]()
    var sum, count = 0
    var current: TreeNode = null
    while (!q.isEmpty) {
      current = q.dequeue
      println("----------------------- " +current)
      if (current == null) {
        result += sum / count
        sum = 0
        count = 0
        if(!q.isEmpty)q.enqueue(null)
      }else {
        if (current.left != null) q.enqueue(current.left)
        if (current.right != null) q.enqueue(current.right)
        sum = sum + current.value
        count = count + 1
      }
    }
    result.toArray
  }

  val root = new TreeNode(
    1,
    new TreeNode(2,null,null),
    new TreeNode(3,null,
      new TreeNode(4,null,null)
    )
  )

  println("averageOfLevels "+ averageOfLevels(root))
}

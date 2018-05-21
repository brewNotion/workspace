package LeetCode.easy

object ArrayLeetCode extends App{

  def removeElement(nums: Array[Int], value: Int): Int = {
    var e = nums.length - 1
    var f = 0
    while(f<e){
      if(nums(f)==value){
        while(e>=0 && nums(e)==value){
          e -= 1
        }
        nums(f) = if(e>f) nums(e) else nums(f)
      }else{
        f+=1
      }
    }
    e
  }
}

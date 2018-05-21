package HackerRank.java.strings

object JavaAnagrams {

  def isAnagram(a: String, b: String): Boolean = {
    val buff = Array.fill[Int](26)(0)

    for(i <- 0 until a.length){
      buff(a(i) - (if(a(i)<95)'A'else'a')) += 1
      buff(b(i) - (if(b(i)<95)'A'else'a')) -= 1
    }
    buff.sum == 0
  }
}

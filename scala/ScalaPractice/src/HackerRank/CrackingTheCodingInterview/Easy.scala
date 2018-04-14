package HackerRank.CrackingTheCodingInterview

object Easy extends App{

  def RansomeNote(): Unit = {
    val sc = new java.util.Scanner (System.in);
    var m = sc.nextInt();
    var n = sc.nextInt();
    var magazine = scala.collection.mutable.Map[String,Int]()
    var word:String =  ""
    for(_ <- 0 to m-1) {
      word = sc.next();
      magazine(word) = if(magazine.contains(word)) magazine(word) + 1 else 1;
    }
    var ans = "Yes"
    for(_ <- 0 to n-1) {
      word = sc.next();
      if(magazine.contains(word) && magazine(word)>0){
        magazine(word) = magazine(word) - 1
      }else{
        print("No")
        return
      }
    }
    print(ans)
  }

  def RansomeNoteFunc(): Unit ={
    import scala.io.StdIn._
    readLine()
    var magazine = readLine().split(" ")
    var ransome = readLine().split(" ")
    ransome.diff(magazine).length
  }

}

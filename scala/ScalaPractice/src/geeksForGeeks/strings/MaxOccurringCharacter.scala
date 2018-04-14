package geeksForGeeks.strings

/*
* https://www.geeksforgeeks.org/return-maximum-occurring-character-in-the-input-string/
* Input Ascii - 0 - 65,536
* Case Insensitive
* On conflict it should return the first occurring character in the string
* */
object MaxOccurringCharacter extends App {


  while(true) {
    val str = scala.io.StdIn.readLine();
    println(getMaxOccurringCharacter(str))
    println(getMaxOccuringChar(str))
  }
  def getMaxOccurringCharacter(str:String):Char = {
    var maxChar = str(0);
    var lastMax = 0;
    val lu = scala.collection.mutable.Map[Char,Int]()
    for( c <- str){
      lu.get(c) match {
        case Some(k) => {
          lu(c) = k+1
          if(lu(c)>lastMax){
            maxChar = c;
            lastMax = lu(c);
          }
        }
        case None => lu += (c -> 1)
      }
    }
    println(lu)
    maxChar
  }

  def getMaxOccuringChar(str:String):Char =
  {
    var max = -1
    var maxChar:Char = str(0);
    val count = new Array[Int](65356);
    for(i <- 0 to str.length-1) {
      count(str(i))+=1;
      if(count(str(i))>max)
      {
        max=count(str(i));
        maxChar=str(i);
      }
    }
    return maxChar;
  }
}

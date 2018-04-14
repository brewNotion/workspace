package HackerRank.Algorithm

object Implementation {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    val q = sc.nextInt();
    var a0 = 0;
    while (a0 < q) {
      val s = sc.next();
      // your code goes here
      val num = isBeautiful(s)
      if(num == -1l)
        println("NO")
      else
        println("Yes ")
      a0 += 1;
    }

    import util.control.Breaks._
    def isBeautiful(s: String): Long = {
      var num1, num2, num3 = 0l
      for (i <- 1 to s.length / 2) {
        num1 = s.take(i).toLong
        num2 = s.slice(i,i+i).toLong
        breakable {
          if (num1 == num2 - 1 || num1 == num3-1) {
            var step = i+1
            if(num1==num2-1){
              num3 = num2
              step = i
            }
            println(s"----------- $num1 $num3")
            for (j <- i to s.length - step by step) {
              val num4 = s.slice(j,j+step).toLong
              println(s"++ $num3 $num4")
              if (num3 != num4 - 1)
                break
              num3 = num4
            }
            return num1
          }
        }
      }
      return -1
    }
  }
}


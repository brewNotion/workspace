object Driver{

  def run(f:()=>Unit) = {
    for ( _ <- 1 to 10)
      f()
  }
}

object Main extends App{
  var count = 0
  def mainRun = {
    Driver.run(() => count+=1)
    println(count)
  }
  mainRun
  println(s"count out $count")
}
class MyDecimalSystem(value:Int) {
  var data = value
  def ++():Int = {
    data += 1
    data
  }

  override def toString: String = data.toString
}

object Main extends App {
  val myDecimalObject = new MyDecimalSystem(10)
  println(s"Actual State = $myDecimalObject")
  println(s"On Increment = ${myDecimalObject ++}")
  println(s"After Increment = $myDecimalObject")
}
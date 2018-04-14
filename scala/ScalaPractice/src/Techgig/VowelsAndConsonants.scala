package Techgig

object VowelsAndConsonants extends App{

  // https://www.techgig.com/challenge/question/prime-code-champ-4/VXNSVFdlVVRyW45cVIBXVVxZV1N0Zo9aVHlZXF9eVVs=/1
  println(Consonant("ritikisagoodboy", 9))
  def Consonant(input1: String, input2: Int): Int = {

    val VOWELS = Array('a', 'e', 'i', 'o', 'u')
    var ptr1 = -1
    var consos = 0
    while (ptr1 < input1.length-1 && consos < input2) {
      ptr1 += 1
      consos += (if (VOWELS.contains(input1(ptr1))) 0 else 1)
    }
    println("ptr1"+ptr1)
    if (consos < input2) return -1

    var ptr2 = 0
    var ans = ptr1 + 1
    var tempConsos = consos
    while (ptr1 < input1.length - 1) {
      consos -= (if (VOWELS.contains(input1(ptr2))) 0 else 1)
      ptr2 += 1
      ptr1 += 1
      consos += (if (VOWELS.contains(input1(ptr1))) 0 else 1)
      if (consos < input2) {
        println(ptr2+","+ptr1+", "+ans)
        ptr1 = ans
        tempConsos += (if (VOWELS.contains(input1(ptr1))) 0 else 1)
        consos = tempConsos
        ptr2 = 0
        ans += 1
      }
    }
    return if(consos>=input2) ans else -1
  }
}

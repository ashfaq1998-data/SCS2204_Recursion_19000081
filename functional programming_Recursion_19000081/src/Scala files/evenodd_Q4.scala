

object evenodd {
  
  def even(x:Int):Boolean = x match{
    case 0 => true
    case _ => odd(x-1)
  }
  
  def odd(x:Int):Boolean = !(even(x))
  
  
  def main(args:Array[String])
    {
        println("Please enter a number: ")
        var x = scala.io.StdIn.readInt()
        if(even(x)){
          println(x + " is even number ")
        }else{
          println(x + " is odd number ")
        }
    }
}
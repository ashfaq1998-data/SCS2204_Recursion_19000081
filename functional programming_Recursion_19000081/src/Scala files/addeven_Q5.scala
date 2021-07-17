

object addeven {
  def even(x:Int):Boolean = x match{
    case 0 => true
    case _ => odd(x-1)
  }
  
  def odd(x:Int):Boolean = !(even(x))
  
    def main(args:Array[String])
    {
        var sum = 0
        println("Please enter a number: ")
        var x = scala.io.StdIn.readInt()
        var y = x
        while(x >= 0){
          
          if(even(x)){
            sum = sum + x
          }
          x = x - 1
        }
        
        println("The sum of all even numbers between 0 and " + y + " including is " + sum)
    }
}
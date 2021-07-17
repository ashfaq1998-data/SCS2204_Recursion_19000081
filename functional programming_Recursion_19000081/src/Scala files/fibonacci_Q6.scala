

object fibonacci {
  def fibonacciSeq(n:Int): Int= n match{
    case n if(n == 0) => 0
    case n if(n == 1) => 1
    case n => fibonacciSeq(n-1) + fibonacciSeq(n-2)
  }
    
  
  def fibonaccitotal(n:Int):Unit= {
    if (n > 0) fibonaccitotal(n-1)
    println(fibonacciSeq(n))
  }
  
  def main(args:Array[String])
    {
        println("Please enter a number: ")
        var x = scala.io.StdIn.readInt()
        println("The sequence of fibonacci for first " + x + " is")
        fibonaccitotal(x)
    
  
 
    }
}


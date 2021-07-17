

object total {
  
    def sum(n:Int): Int=
    {
        if(n == 1) 1
        else n + sum(n - 1)
    }
      
    // Main method
    def main(args:Array[String])
    {
        println("Please enter a number: ")
        var x = scala.io.StdIn.readInt()
        println("The total sum of the "+ x + " is ")
        println(sum(x))
    }

}
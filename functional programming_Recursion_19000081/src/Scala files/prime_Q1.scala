object prime {
    
  def gcd(i:Int, j:Int):Int=j match{
    
    case 0 => i
    case j if(j>i) => gcd(j,i)
    case _ => gcd(j,i%j)
    
  }
  
  def checkprime(n:Int, a:Int =2):Boolean = a match{
    case a if(a == n) => true
    case a if(gcd(n,a) > 1) => false
    case a => checkprime(n,a+1)
  }
  
  
  
  
  def main(args: Array[String]){
    println("Please enter a number: ")
    var x = scala.io.StdIn.readInt()
    println("The result is")
    println(checkprime(x))
    
  }
    
  
  
   }
/**
 * Created by abes on 12/11/2015.
 */
object Ex_1_19 {

  def main(args: Array[String]) {
    val n = 6

    print(fib(n))
  }


  def fib(n: Int): Long ={
    fibIter(1,0,0,1,n)
  }

  def fibIter(a: Long, b: Long, p: Long, q: Long, count: Long ): Long ={
    if(count == 0) b
    else if(count % 2 == 0) fibIter(a,b, p*p + q * q, 2*p*q + q*q , count /2)
    else fibIter( b * q + (a * q) + (a * p), (b * p) + (a * q), p, q, count - 1)
  }


}

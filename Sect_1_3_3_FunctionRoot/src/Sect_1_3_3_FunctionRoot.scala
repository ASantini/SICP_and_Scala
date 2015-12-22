/**
 * Created by abes on 12/15/2015.
 */
object Sect_1_3_3_FunctionRoot {

  def main(args: Array[String]): Unit ={
    println(search(squareMinusFour, -1.0, 4.0))
  }

  def halfIntervalMethod(f: Double => Double, a: Double, b: Double) {
    val aValue = f(a)
    val bValue = f(b)
    if(aValue < 0 && bValue > 0) search(f, a, b)
    else if (bValue < 0 && aValue > 0) search(f, b, a)
    else println("Values are not of opposite sign")

  }

  def search(f: Double => Double, negPoint: Double, posPoint: Double): Double = {
    val midpoint = average(List(negPoint, posPoint))
    println("Midpoint:" + midpoint)
    if(isCloseEnogh(negPoint, posPoint)){
      midpoint
    } else{
      val testValue = f(midpoint)
      if (testValue > 0) search(f, negPoint, midpoint)
      else if (testValue < 0) search(f, midpoint, posPoint)
      else midpoint
    }

  }

  def average(data: Iterable[Double]): Double = {
    data.sum / data.size
  }

  def isCloseEnogh(a: Double, b: Double): Boolean = {
    Math.abs(a - b) < .00000001
  }

  def identity(x: Double): Double = x

  def squareMinusFour(x:Double): Double = x*x - 4
}

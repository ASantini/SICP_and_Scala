/**
 * Created by abes on 12/15/2015.
 */
class Sect_1_3_3_FunctionRoot {

  def main(args: Array[String]): Unit ={
    search(((x: Double) => x), -1, 4)
  }

  def search(f: Function, negPoint: Double, posPoint: Double): Double {
    val midpoint = average(List(f(negPoint), f(posPoint)))
  }

  def average(data: Iterable[Double]): Double = {
    data.sum / data.size
  }

  def function1(x: Double): Double = {
   x
  }

}

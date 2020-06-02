import org.apache.spark.SparkContext

object HelloWorld {

  def main(args: Array[String]): Unit ={
    println(args(0))
    var sc = SparkContext()
  }
}

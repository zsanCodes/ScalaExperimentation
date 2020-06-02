import org.apache.spark.{SparkConf, SparkContext}

object HelloWorld {

  def main(args: Array[String]): Unit ={
    System.setProperty("hadoop.home.dir", "C:\\hadoop")
    val sparkConf = new SparkConf().setAppName("SOME APP NAME").setMaster("local[2]");

    val sc = new SparkContext(sparkConf)
    sc.setLogLevel("ERROR")
    val data = sc.textFile("testFile.txt")
    val words = data.flatMap(line => line.split("\n"))
    val lineWithBee = words.filter(_.contains("bee"))
    lineWithBee.foreach(println(_))
  }
}

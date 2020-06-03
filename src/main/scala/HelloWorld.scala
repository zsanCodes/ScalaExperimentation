import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.{DataFrame, Row, SQLContext, SparkSession}

object HelloWorld {

  def query(file:String, dbName:String,query:String): Unit = {
    //create spark session
    val ss = SparkSession.builder().master("local")
      .appName("Spark Sesh").getOrCreate()
    SparkSession.builder()
    //read from provided file name to create DataFrame
    val data = ss.read.option("header","true").csv(file)
    //create SQL database out of DataFrame
    data.createOrReplaceTempView(dbName)
    //perform provided SQL query
    val sqlDF = ss.sql(query)
    sqlDF.show()

  }

  def main(args: Array[String]): Unit ={
    System.setProperty("hadoop.home.dir", "C:\\hadoop")

    query("C:\\Users\\Zoe Sanders\\Desktop\\Notes\\Learning\\covid_19_data.csv",
    "covid-19", "Select")

  }
}

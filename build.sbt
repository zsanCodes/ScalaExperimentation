name := "ScalaAgain"

version := "0.1"

scalaVersion := "2.11.11"



libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.11" % "2.3.0",
  "org.apache.spark" % "spark-sql_2.11" % "2.3.0"
)
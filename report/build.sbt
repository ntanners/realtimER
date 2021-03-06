name := "report"
version := "1.0"
scalaVersion := "2.11.6"
val sparkVersion = "2.2.0"

resolvers ++= Seq(
  "apache-snapshots" at "http://repository.apache.org/snapshots/"
)

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.spark" %% "spark-hive" % sparkVersion,
  "org.apache.kafka" % "kafka-streams" % "0.10.2.0",
  "org.apache.kafka" % "kafka-clients" % "0.10.2.0",
  "mysql" % "mysql-connector-java" % "5.1.6"
)


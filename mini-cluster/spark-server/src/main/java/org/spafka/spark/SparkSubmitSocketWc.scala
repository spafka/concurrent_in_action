package org.spafka.spark

import org.apache.spark.deploy.SparkSubmit

object SparkSubmitSocketWc {

  def main(args: Array[String]): Unit = {

    val strings: Array[String] = ("--master=spark://0.0.0.0:7077\n" +
      "--class=org.apache.spark.examples.streaming.NetworkWordCount\n" +
      "--verbose=true\n" +
      "--deploy-mode=cluster\n" +
      "--supervise\n" +
      "--executor-memory=2G\n" +
      "--total-executor-cores=2\n" +
      "mini-cluster/spark-server/target/spark-server-1.0.jar\n")
      .split("\n")

    SparkSubmit.main(strings ++ args)

  }

}

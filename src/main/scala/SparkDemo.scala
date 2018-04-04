import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object SparkDemo {
  def main(args:Array[String]){
    val conf = new SparkConf().setMaster("local[2]").setAppName("SparkDemo")
    val sc = new SparkContext(conf)
    val file = sc.textFile("C:\\hadoop\\edureka\\scala\\dataset\\retail_db\\order_items\\part-m-00000")

    println(file.count())
  }
}

package pl.jvsystem.futures

import scala.concurrent.Future
import scala.util.Random
import scala.concurrent.ExecutionContext.Implicits.global

/**
 *
 * @author Przemek Nowak [przemek.nowak.pl@gmail.com]
 *         Date: 2015-04-14 15:17
 */
object Cloud {

  def runAlgorithm(i: Int): Future[Int] = Future {
    sleep(Random.nextInt(500))
    val result = i + 10
    println(s"returning result from cloud: $result")
    result
  }

}

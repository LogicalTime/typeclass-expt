package mvb.typeclass.lab1

import mvb.typeclass.lab1.thirdparty.StatisticsFunctionality

/**
  * From: http://danielwestheide.com/blog/2013/02/06/the-neophytes-guide-to-scala-part-12-type-classes.html
  * Created by Mark on 3/26/2016.
  */
object Expt1 extends App{
  import StatisticsFunctionality._
  import JodaImplicits._
  import org.joda.time.Duration._

  val durations = Vector(standardSeconds(20), standardSeconds(57), standardMinutes(2),
    standardMinutes(17), standardMinutes(30), standardMinutes(58), standardHours(2),
    standardHours(5), standardHours(8), standardHours(17), standardDays(1),
    standardDays(4))

  println{
    mean(List(1,2,3).toVector)
  }

  println{
    mean(durations)
  }
}

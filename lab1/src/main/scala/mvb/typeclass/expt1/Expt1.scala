package mvb.typeclass.expt1
import JodaImplicits
import mvb.typeclass.expt1.orig.Statistics
/**
  * Created by Mark on 3/26/2016.
  */
object Expt1 extends App{
  import Statistics._
  import JodaImplicits._
  import org.joda.time.Duration._

  val durations = Vector(standardSeconds(20), standardSeconds(57), standardMinutes(2),
    standardMinutes(17), standardMinutes(30), standardMinutes(58), standardHours(2),
    standardHours(5), standardHours(8), standardHours(17), standardDays(1),
    standardDays(4))

  println{
    mean(durations)
  }
}

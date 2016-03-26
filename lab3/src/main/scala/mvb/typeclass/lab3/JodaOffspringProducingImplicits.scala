package mvb.typeclass.lab2



/**
  * Created by Mark on 3/26/2016.
  */
object JodaOffspringProducingImplicits {
  import mvb.typeclass.lab3.orig.Offspring.OffspringProducingLike
  import org.joda.time.Duration

  implicit object OffspringProducingLikeDuration extends OffspringProducingLike[Duration] {
    override def offspringName(t: Duration): String = "time-child"
  }
}

package mvb.typeclass.lab1



/**
  * Created by Mark on 3/26/2016.
  */
object JodaImplicits {
  import mvb.typeclass.lab1.thirdparty.NumberLike
  import org.joda.time.Duration
  implicit object NumberLikeDuration extends NumberLike[Duration] {
    def plus(x: Duration, y: Duration): Duration = x.plus(y)
    def divide(x: Duration, y: Int): Duration = Duration.millis(x.getMillis / y)
    def minus(x: Duration, y: Duration): Duration = x.minus(y)
  }
}

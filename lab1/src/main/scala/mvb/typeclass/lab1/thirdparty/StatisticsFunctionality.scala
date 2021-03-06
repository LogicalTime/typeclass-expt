package mvb.typeclass.lab1.thirdparty

/**
  * Created by Mark on 3/26/2016.
  */
object StatisticsFunctionality {
  def mean[T](xs: Vector[T])(implicit ev: NumberLike[T]): T =
    ev.divide(xs.reduce(ev.plus), xs.size)
  def median[T : NumberLike](xs: Vector[T]): T = xs(xs.size / 2)
  def quartiles[T: NumberLike](xs: Vector[T]): (T, T, T) =
    (xs(xs.size / 4), median(xs), xs(xs.size / 4 * 3))
  def iqr[T: NumberLike](xs: Vector[T]): T = quartiles(xs) match {
    case (lowerQuartile, _, upperQuartile) =>
      implicitly[NumberLike[T]].minus(upperQuartile, lowerQuartile)
  }
}

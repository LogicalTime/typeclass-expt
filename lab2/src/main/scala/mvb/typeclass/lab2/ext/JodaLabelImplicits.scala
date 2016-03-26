package mvb.typeclass.lab2.ext

/**
  * Created by Mark on 3/26/2016.
  */
object JodaLabelImplicits {
  import mvb.typeclass.lab2.orig.Labeling.LabelLike
  import org.joda.time.Duration

  implicit object LabelLikeDuration extends LabelLike[Duration] {
    override def toLabel(x: Duration): String = s"${x.getStandardHours}-StandardHours"
  }
}

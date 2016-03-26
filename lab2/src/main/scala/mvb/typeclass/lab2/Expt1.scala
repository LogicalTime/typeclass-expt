package mvb.typeclass.lab2


/**
  * Created by Mark on 3/26/2016.
  */
object Expt1 extends App{
  import mvb.typeclass.lab2.orig.LabelPrinting._
  import JodaLabelImplicits._
  import org.joda.time.Duration._

  println{
    printLabel(standardDays(50))
  }
}

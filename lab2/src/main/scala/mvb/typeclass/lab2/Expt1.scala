package mvb.typeclass.lab2


/**
  * From http://debasishg.blogspot.com/2010/06/scala-implicits-type-classes-here-i.html
  * Created by Mark on 3/26/2016.
  */
object Expt1 extends App{
  import mvb.typeclass.lab2.thirdparty.LabelPrintingFunctionality._
  import JodaLabelImplicits._
  import org.joda.time.Duration._

  println{
    printLabel(standardDays(50))
  }
}

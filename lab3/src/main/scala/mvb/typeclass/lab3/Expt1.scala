package mvb.typeclass.lab2

import mvb.typeclass.lab3.orig.{Cat, Dog}


/**
  * from: http://like-a-boss.net/2013/03/29/polymorphism-and-typeclasses-in-scala.html
  * Created by Mark on 3/26/2016.
  */
object Expt1 extends App{
  import mvb.typeclass.lab3.orig.OffspringNaming._
  import JodaOffspringProducingImplicits._
  import org.joda.time.Duration._

  println{
    List(offspring(new Cat), offspring(new Dog), offspring(standardDays(10)))
  }
}

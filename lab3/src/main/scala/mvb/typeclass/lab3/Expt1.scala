package mvb.typeclass.lab3

import mvb.typeclass.lab3.thirdparty.{Cat, Dog}


/**
  * from: http://like-a-boss.net/2013/03/29/polymorphism-and-typeclasses-in-scala.html
  * Created by Mark on 3/26/2016.
  */
object Expt1 extends App{
  import mvb.typeclass.lab3.thirdparty.OffspringNamingFunctionality._
  import JodaOffspringProducingImplicits._
  import org.joda.time.Duration._

  println{
    List(offspring(new Cat), offspring(new Dog), offspring(standardDays(10)))
  }
}

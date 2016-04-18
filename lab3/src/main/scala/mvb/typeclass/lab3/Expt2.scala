package mvb.typeclass.lab3

import mvb.typeclass.lab3.thirdparty.{Cat, Dog, OffspringNamingFunctionality}
import org.joda.time.Duration


/**
  * Showing what imports are really needed to do this.
  * from: http://like-a-boss.net/2013/03/29/polymorphism-and-typeclasses-in-scala.html
  * Created by Mark on 3/26/2016.
  */
object Expt2 extends App{
  import JodaOffspringProducingImplicits._

  println{
    List(
      OffspringNamingFunctionality.offspring(new Cat),
      OffspringNamingFunctionality.offspring(new Dog),
      OffspringNamingFunctionality.offspring(Duration.standardDays(10)))
  }
}

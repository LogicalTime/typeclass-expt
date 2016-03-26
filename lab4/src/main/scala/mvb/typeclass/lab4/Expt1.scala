package mvb.typeclass.lab4

import mvb.typeclass.lab4.thirdparty.Person


/**
  * from: http://like-a-boss.net/2013/03/29/polymorphism-and-typeclasses-in-scala.html
  * Created by Mark on 3/26/2016.
  */
object Expt1 extends App{
  import mvb.typeclass.lab4.thirdparty.ReversingFunctionality._
  import org.joda.time.Duration._

  println{
    reverseIt(Person("John", "Doe", 75))
  }
}

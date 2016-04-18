package mvb.typeclass.lab4

import mvb.typeclass.lab4.thirdparty.{Person, ReversingFunctionality}

/**
  * Showing how you can do this with standard imports.
  * from: http://like-a-boss.net/2013/03/29/polymorphism-and-typeclasses-in-scala.html
  * Created by Mark on 3/26/2016.
  */
object Expt2 extends App{

  println{
    ReversingFunctionality.reverseIt(Person("John", "Doe", 75))
  }
}

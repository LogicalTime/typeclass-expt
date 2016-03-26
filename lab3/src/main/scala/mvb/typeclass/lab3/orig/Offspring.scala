package mvb.typeclass.lab3.orig

/**
  * From http://debasishg.blogspot.com/2010/06/scala-implicits-type-classes-here-i.html
  */

object Offspring {
  trait OffspringProducingLike[T] {
    def offspringName(t: T): String
  }

  object OffspringProducingLike {
    implicit object CatHasOffspringName extends OffspringProducingLike[Cat] {
      override def offspringName(cat: Cat) = "Kitty"
    }
    implicit object DogHasOffspringName extends OffspringProducingLike[Dog] {
      override def offspringName(cat: Dog) = "Puppy"
    }
  }
}




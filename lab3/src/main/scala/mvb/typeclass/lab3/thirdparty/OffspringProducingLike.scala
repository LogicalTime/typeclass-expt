package mvb.typeclass.lab3.thirdparty

/**
  * Created by Mark on 3/26/2016.
  */
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

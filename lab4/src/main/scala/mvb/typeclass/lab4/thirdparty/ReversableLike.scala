package mvb.typeclass.lab4.thirdparty

/**
  * Interface you need to adapt your chosen class to so that you can use the methods in the functionality class.
  */
trait ReversableLike[T] {
  def reverse(t: T): T
}

object ReversableLike {

  implicit object ReversableLikeString extends ReversableLike[String] {
    override def reverse(t: String): String = t.reverse
  }

  implicit object ReversableLikePerson extends ReversableLike[Person] {
    def reverse(p: Person) = Person(p.last, p.first, p.age)
  }

}

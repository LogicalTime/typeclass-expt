package mvb.typeclass.lab4.orig

/**
  * Created by Mark on 3/26/2016.
  */



object Reversals {

  trait ReversableLike[T]{
    def reverse(t:T): T
  }

  implicit object ReversableLikeString extends ReversableLike[String]{
    override def reverse(t: String): String = t.reverse
  }

  implicit object ReversableLikePerson extends ReversableLike[Person]{
    def reverse(p: Person) = Person(p.last, p.first, p.age)
  }


}

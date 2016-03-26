package mvb.typeclass.lab4.orig


/**
  * Created by Mark on 3/26/2016.
  */
object ReversingFunctionality {
  def reverseIt[T: ReversableLike](o: T): T = {
    val reverser = implicitly[ReversableLike[T]]
    reverser.reverse(o)
  }

}

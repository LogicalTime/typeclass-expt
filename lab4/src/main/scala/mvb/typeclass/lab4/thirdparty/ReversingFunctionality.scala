package mvb.typeclass.lab4.thirdparty


/**
  * The functionality you really want.
  * I'd say start here and define the methods you want, and this will
  * incrementally tell you what Functions to add to ReversableLike
  */
object ReversingFunctionality {
  def reverseIt[T: ReversableLike](o: T): T = {
    val reverser = implicitly[ReversableLike[T]]
    reverser.reverse(o)
  }

}

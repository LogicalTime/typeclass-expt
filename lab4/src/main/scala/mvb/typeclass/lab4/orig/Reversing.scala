package mvb.typeclass.lab4.orig

import mvb.typeclass.lab4.orig.Reversals.ReversableLike

/**
  * Created by Mark on 3/26/2016.
  */
object Reversing {
  def reverseIt[T: ReversableLike](o: T): T = {
    val reverser = implicitly[ReversableLike[T]]
    reverser.reverse(o)
  }

}

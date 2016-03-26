package mvb.typeclass.lab3.orig

import mvb.typeclass.lab3.orig.Offspring.OffspringProducingLike

/**
  * Created by Mark on 3/26/2016.
  */
object OffspringNaming {
  def offspringContextBoundSyntax[T: OffspringProducingLike](t: T) =
    implicitly[OffspringProducingLike[T]].offspringName(t)

  def offspring[T](t: T)(implicit lm: OffspringProducingLike[T]) = lm.offspringName(t)
}

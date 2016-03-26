package mvb.typeclass.lab3.thirdparty

/**
  * Created by Mark on 3/26/2016.
  */
object OffspringNamingFunctionality {
  def offspringContextBoundSyntax[T: OffspringProducingLike](t: T) =
    implicitly[OffspringProducingLike[T]].offspringName(t)

  def offspring[T](t: T)(implicit lm: OffspringProducingLike[T]) = lm.offspringName(t)
}

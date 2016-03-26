package mvb.typeclass.lab2.thirdparty

/**
  * Created by Mark on 3/26/2016.
  */
object LabelPrintingFunctionality {
  def printLabelContextBoundSyntax[T: LabelLike](t: T) = implicitly[LabelLike[T]].toLabel(t)
  def printLabel[T](t: T)(implicit lm: LabelLike[T]) = lm.toLabel(t)
}

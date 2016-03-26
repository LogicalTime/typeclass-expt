package mvb.typeclass.lab2.orig

/**
  * Created by Mark on 3/26/2016.
  */
object LabelPrinting {
  import Labeling.LabelLike
  def printLabelContextBoundSyntax[T: LabelLike](t: T) = implicitly[LabelLike[T]].toLabel(t)
  def printLabel[T](t: T)(implicit lm: LabelLike[T]) = lm.toLabel(t)
}

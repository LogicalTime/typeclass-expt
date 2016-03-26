package mvb.typeclass.lab2.orig

object Labeling {
  trait LabelLike[T] {
    def toLabel(value: T): String
  }

  object LabelLike {
    implicit object AddressLabelMaker extends LabelLike[Address] {
      def toLabel(address: Address): String = {
        import address._
        "%d %s, %s, %s - %s".format(no, street, city, state, zip)
      }
    }

  }
}




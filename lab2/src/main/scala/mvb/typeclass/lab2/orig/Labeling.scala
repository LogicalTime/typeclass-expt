package mvb.typeclass.lab2.orig

/**
  * From http://debasishg.blogspot.com/2010/06/scala-implicits-type-classes-here-i.html
  */

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




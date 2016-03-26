package mvb.typeclass.lab2.thirdparty

/**
  * Created by Mark on 3/26/2016.
  */
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

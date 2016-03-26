# Type-class Laboratory
Intent: To help us get comfortable using type-classes in scala.

## Steps For Developing a Type-Class
* Create an empty type-class. I like ending a type-classes' name with "Like".
```
trait NumberLike[T] {

}
```
* Start describing the functionality in a class
```
object StatisticsFunctionality {
  def mean[T](xs: Vector[T])(implicit ev: NumberLike[T]): T = ???

}
```
* As you try and implement the functionality, you'll realize your type-class needs certain methods. Add those in.
I like ending my functionality classes with "Functionality" right now. Not sure what conventions are out there for
quick recognition.
```
object StatisticsFunctionality {
  def mean[T](xs: Vector[T])(implicit ev: NumberLike[T]): T =
    ev.divide(xs.reduce(ev.plus), xs.size)
}

trait NumberLike[T] {
  def plus(x: T, y: T): T
  def divide(x: T, y: Int): T
}
```
* As you go on. Think about your type-class and make sure it follows good interface principles.


## Thoughts
* You could abstract away the functionality behind a interface as well. That would allow different implementations.
* Could use some naming conventions to make the different pieces easily recognizable. I wonder what is out there.
* I wonder if there are names for the different pieces, type-class trait,
 type-class implicit objects, functionality that uses the type-class

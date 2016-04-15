## Recursion (aka Recursive Methods)

* They need to have the return type defined explicitly
* You can use @tailrec to ensure tail recursion

```
// How is case inside match similar to case class?

// FIXME It does NOT work for two-or-more-elements collections
def giveMeTheLastElement[T](list: Seq[T]): T = list match {
  case Nil => throw new Exception("no elements inside...sorry")
  case head :: tail => head
  case _ => giveMeTheLastElement(list.tail)
}

giveMeTheLastElement(List())
giveMeTheLastElement(Nil)
giveMeTheLastElement(Seq(1))

val manyElems = (0 to 9).map(_.toString)
giveMeTheLastElement(manyElems)
```

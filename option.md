## Parameterized Type: Option

Review [Option's scaladoc](http://www.scala-lang.org/api/current/index.html#scala.Option) where the different ways are presented and classified as the most and less idiomatic.

An idiom to avoid returning a sentinel or null value when no value is returned from a method, e.g. `fetchMaxOffset`.

```
Some(fetchMaxOffset()).filterNot(_.offset == -1)

// Idiom: Throw exception when no value is found
val acc: Accumulable[Any, Any] = Accumulators.get(id) match {
  case Some(accum) => accum.asInstanceOf[Accumulable[Any, Any]]
  case None =>
    throw new SparkException(s"attempted to access non-existent accumulator $id")
}
```

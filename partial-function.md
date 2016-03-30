## Partial Function

[Map](http://www.scala-lang.org/api/current/index.html#scala.collection.Map) is a total and partial function.

See:

* [PartialFunction](http://www.scala-lang.org/api/current/index.html#scala.PartialFunction)
* `collect` method -  http://www.scala-lang.org/api/current/index.html#scala.collection.Seq@collect[B](pf:PartialFunction[A,B]):Seq[B]

Example:

```
val m = Map[String, Int]("hello" -> 5, "world" -> 5)
val mf: PartialFunction[String, Int] = m
val catchAll: PartialFunction[Any, String] = { case _ => "NotFound"}
val handler = mf orElse catchAll
Seq("hello", "nice").collect(handler)
```

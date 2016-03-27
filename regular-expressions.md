## Regular expressions

See:

* [java.util.regex.Pattern](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html)
* [scala.util.matching.Regex](http://www.scala-lang.org/api/current/index.html#scala.util.matching.Regex)

Example:

```
scala> "hello, world".split("\\s+")
res5: Array[String] = Array(hello,, world)

scala> "hello, world".split("\\W+")
res6: Array[String] = Array(hello, world)
```

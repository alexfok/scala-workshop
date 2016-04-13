## Case Classes

**NOTE:** Make them always `final`.

Automatic generation of many productive methods:

* Companion object with factory methods to create instances (without `new`)
  * `apply`
  * instantiation looks almost like calling a function
* `unapply` for pattern matching
* `copy` method
  * `mr.copy(word = mr.word.capitalize)`

### Example: unapply

```
object CustomUnapply {
  def unapply(s: String): Option[String] = Some(s"Always returns input: $s")
}

scala> val CustomUnapply(s) = "hello"
s: String = Always returns input: hello
```

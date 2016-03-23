## Case Classes

**NOTE:** Make them always `final`.

Automatic generation of many productive methods:

* Companion object with factory methods to create instances (without `new`)
  * `apply`
  * instantiation looks almost like calling a function
* `unapply` for pattern matching
* `copy` method
  * `mr.copy(word = mr.word.capitalize)`

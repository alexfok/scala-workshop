# Extension methods using Value Classes

## Introduction

```
implicit class HelloInt(val self: Int) extends AnyVal {
  def hello: String = "hello" * self
}
```

The above definition should make it for the following code:

```
5.hello
```

## References

1. [Value Classes and Universal Traits](http://docs.scala-lang.org/overviews/core/value-classes.html#extension-methods)

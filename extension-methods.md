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

## See it in Action

Run `sbt` in the project and execute `runMain ExtensionMethods`.

```
> runMain ExtensionMethods
[info] Running ExtensionMethods
hellohellohellohellohello
[success] Total time: 0 s, completed Aug 13, 2016 8:46:21 PM
```

## References

1. [Value Classes and Universal Traits](http://docs.scala-lang.org/overviews/core/value-classes.html#extension-methods)

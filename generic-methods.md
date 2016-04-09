## Generic Methods (aka Parameterized Methods)

Create a method that would execute `block` until `condition` is met.

```
def until[T](condition: => Boolean)(block: => T): T
```

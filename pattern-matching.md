## Pattern Matching

* Pattern Matching and Option type - [scala.Option Cheat Sheet](http://blog.tmorris.net/posts/scalaoption-cheat-sheet/)

### Pattern Matching on Assignment

```
val sqlProjects @ Seq(catalyst, sql, hive, hiveThriftServer) = Seq(...)
```

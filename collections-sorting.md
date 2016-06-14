## Collection Sorting

```
case class Info(id: String)
val infos = Seq(Info("5"), Info("driver"), Info("1"), Info("10"), Info("500"))

implicit val onString = Ordering[Int].on((s: String) => util.Try(s.toInt).getOrElse(-1))
infos.sortBy(_.id)
```

```
Seq.sortWith
Seq.sortBy
```

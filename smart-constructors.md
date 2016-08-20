# Smart Constructors

## Introduction

Hide the primary constructor by using `private` and provide a smart constructor that knows more about your business requirement.

```
object test {
final case class Id private (id: Long) extends AnyVal
object Id {
  def fromLong(id: Long): Option[Id] = {
    if (id < 0 || id > 10) None else Some(Id(id))
  }
}
}
```

## References

1. [Decorate your types with refined - Frank Thomas](https://youtu.be/zExb9x3fzKs)

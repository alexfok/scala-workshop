## Parameterized Type: Option

An idiom to avoid returning a sentinel or null value when no value is returned from a method, e.g. `fetchMaxOffset`.

```
Some(fetchMaxOffset()).filterNot(_.offset == -1)
```

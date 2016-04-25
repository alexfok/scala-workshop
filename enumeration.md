## Enumeration

Limits the number of acceptable values.

```
object SchedulingMode extends Enumeration {

  type SchedulingMode = Value
  val FAIR, FIFO, NONE = Value
}

SchedulingMode.withName(schedulingModeConf.toUpperCase)
```

NOTE: You could use Algebraic Data Types (ADT) instead.


## Implicit Parameters

Functions in Scala can take **implicit parameters**.

    def hello(implicit message: String): String = message

    implicit val msg = "World!"
    hello

If there is a unique and valid **implicit instance** in the scope, the function will take it automatically so you don't have to pass it explicitly.

    trait Adder[T] {
      def add(t: T): T
    }
    def foo[T](t: T)(implicit a: Adder[T]) = a.add(t)

    implicit val intAdder: Adder[Int] = new Adder[Int] {
      def add(t: Int): Int = t + 10
    }

    foo(5)

    implicit val boolAdder: Adder[Boolean] = new Adder[Boolean] {
      def add(t: Boolean): Boolean = t || true
    }

    foo(true)

NOTE: Implicits are searched in the **companion object** of the trait.

    trait Adder[T] {
      def add(t: T): T
    }
    object Adder {
      implicit val intAdder: Adder[Int] = new Adder[Int] {
        def add(t: Int): Int = t + 10
      }
      implicit val boolAdder: Adder[Boolean] = new Adder[Boolean] {
        def add(t: Boolean): Boolean = t || true
      }
    }

## Example

`Future` and `ExecutionContext`:

```
def map[S](f: T => S)(implicit executor: ExecutionContext): Future[S]
```

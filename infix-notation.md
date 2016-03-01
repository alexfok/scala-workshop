## Infix Notation for Methods

In Scala, you can use **infix notation** for methods:

    case class Adder(x: Int) {
      def plus(y: Int): Int = x + y
    }
    Adder(5).plus(10)  // standard notation
    Adder(5) plus 10   // infix notation

## Infix Notation for Types

You can use the infix operator for types:

    trait T[A, B]

    type T1 = T[Int, String] // standard
    type T2 = Int T String   // infix

## Symbols in Names

You can use symbols in type and method names:

    case class Adder(x: Int) {
      def +(y: Int): Int = x + y
    }
    Adder(5) + 10

    trait ::[A, B]
    type T1 = Int :: String

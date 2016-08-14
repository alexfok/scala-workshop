object ExtensionMethods extends App {
  implicit class HelloInt(val self: Int) extends AnyVal {
    def hello: String = "hello" * self
  }

  println(5.hello)
}

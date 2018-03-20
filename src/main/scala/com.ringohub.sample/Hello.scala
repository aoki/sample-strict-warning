package com.ringohub.sample

import scala.concurrent.Future

object Hello extends Greeting with App {
  println(hello)
}

trait Greeting {
  @deprecated("Please use greeting2 instead of greeting", "0.1.0")
  lazy val hello: String = "hello"

  lazy val hello2: String = "Hello World!!"
}

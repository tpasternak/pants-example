package com;

object MyClass2 {
  def apply(x: Int) = ???
}

object MyClass1 {
}

case class MyClass1(x: Int) {
                                    def apply(x: String) = ???
  def ccc = "???"
  def dd= ???
}

object Hello extends App {
         val w = MyClass1(0)("xyz")
        val z = MyClass1(0)("xyz")
       val q = MyClass1(0)("xyz")
      val zz = MyClass1(0)("xyz")
     MyClass1(0)("ghi")
    MyClass1(0).ccc
   MyClass2(1)
  println("Hello")
}

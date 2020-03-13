package com;

object MyClass2 {
  def apply(x: Int) = 123
}

object MyClass1 {
}

case class MyClass1(x: Int) {
  def apply(x: String) = 1
  def ccc = 1
  def dd= 1
}

object Hello extends App {
         val w = MyClass1(0)("xyz")
        val z = MyClass1(0)("xyz")
       val q = MyClass1(0)("xyz")
      val x = MyClass1(0)("xyz")
     MyClass1(0)("ghi")
    MyClass1(0).ccc
   MyClass2(1)
  println("Hello")
}

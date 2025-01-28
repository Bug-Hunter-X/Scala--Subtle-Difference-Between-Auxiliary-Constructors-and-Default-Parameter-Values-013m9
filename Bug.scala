```scala
class MyClass(val x: Int) {
  def this() = this(0) 
}

val instance = new MyClass()
println(instance.x) //Prints 0

val anotherInstance = new MyClass(5)
println(anotherInstance.x) //Prints 5

class MyOtherClass(val x: Int = 0) {
}

val instance2 = new MyOtherClass()
println(instance2.x) //Prints 0

val anotherInstance2 = new MyOtherClass(5)
println(anotherInstance2.x) //Prints 5
```
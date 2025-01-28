```scala
class MyImprovedClass(val x: Int = 0) {
}

val instance = new MyImprovedClass()
println(instance.x) // Prints 0

val anotherInstance = new MyImprovedClass(5)
println(anotherInstance.x) // Prints 5
```

Using default parameter values directly in the primary constructor is generally preferred for simplicity and readability. It avoids the need for auxiliary constructors, reducing potential confusion and making the code easier to maintain.
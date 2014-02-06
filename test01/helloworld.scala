object main extends App {
	val hello = "Hello"
	var world = "World"

	val helloWorld = hello :+ world
	println("String appending : " + hello + world)
	println(":+ Op : " + helloWorld)
}


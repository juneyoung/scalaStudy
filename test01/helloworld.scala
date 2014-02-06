object main extends App {
	val hello = "Hello"
	var world = "World"

	val helloWorld = hello :+ world
	
	// output in console : helloworld
	println("String appending : " + hello + world)
	// output in console : Vector(H, e, l, l, o, World)
	println(":+ Op : " + helloWorld)
}


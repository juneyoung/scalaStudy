

object AnyRefType extends App {
	//Reference Types(like String, List ...) extend 'AnyRef'
	
	val hello : String = "Hello"
	val world : String = "World"

	// :+ is Reference Object appending Operator
	// It transfers Vector(Char) + Object
	println(hello :+ world)
}

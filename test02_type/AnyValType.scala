

object AnyValType extends App {

	//var is mutable, otherwise val is immutable
	var db : Double = 3.14
	var ft : Float = 3.14159265f
	var bool : Boolean = true
 	var it : Int = 3
	var lg : Long = 314159265l
	var ch : Char = 'A' 

	//List can contain may types at once
	val list = List(db, ft, bool, it, lg, ch)
	list.foreach(println)

	//upcasting to abstract parent Type
	for(i <- 0 until list.size){
		//Scala 'Any' type is similar to java.lang.Object
		//'AnyVal' extends 'Any', but since it is also abstract can not be initialized by new method
		var any : Any = list(i)
		println(any)
	}

	//Any type similar with java.lang.Object
	
}

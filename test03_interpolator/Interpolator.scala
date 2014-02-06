object Interpolator extends App {

	//String value can be adopted with '$'
	//Do not forget 's' front of ""
	val name = "Juneyoung"
	println(s"Welldone, ${name}")

	//can numeric operations inside of interpolator
	println(s"1900 + 114 = ${1900 + 114}")
	
	//'f' means formated. after interpolator add format(%s, %2.2f, ...)
	//CAUTION : in format, 'd' means decimal, not double
	val height = 1.9d
	println(f"$name%s is $height%2.2f meters tall")

	//'raw' means no filter
	println(raw"a\nb")
	println(s"a\nb")
}

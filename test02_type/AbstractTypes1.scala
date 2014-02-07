
trait Buffer {
	type T
	val element: T
}

abstract class SeqBuffer extends Buffer {
	type U
	type T <: Seq[U]
	def length= element.length
}

abstract class IntSeqBuffer extends SeqBuffer {
	type U = Int
}

object AbstractTypeTest1 extends App {
	def newIntSeqBuf(element1: Int, element2: Int): IntSeqBuffer =
		new IntSeqBuffer {
			type T = List[U]
			val element = List(element1, element2)
		}

	val buf = newIntSeqBuf(7, 8)

	println("length = " + buf.length)
	println("content = " + buf.element)
}

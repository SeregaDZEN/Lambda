fun main() {

//    val daysOfWeek = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
//    daysOfWeek.forEach {
//        println(it)
//    }

}
 val a1 = println("1")
val cc = convert((20.0), { it * 1.8 + 32 }, y = 20) { it * 5 }


typealias D = (Double) -> Double

fun convert(x: Double, converter: (Double) -> Double, y: Int, xx: (Int) -> Int): Double {

    val result = converter(x)
    val result2 = xx(y)
    println("$x is converted to ${result + result2 * y} ")
    return (result + result2)

}

//fun convertFive(converter: (ee: Int, e: Int) -> Double): Double {
//    val result = converter(5, 2)
//    println("5 is converted to $result")
//    return result
//}
//
//fun <T, R> Collection<T>.fold(
//    initial: R,
//    combine: (acc: R, nextElement: T) -> R
//): R {
//    var accumulator: R = initial
//    for (element: T in this) {
//        accumulator = combine(accumulator, element)
//    }
//    return accumulator
//}

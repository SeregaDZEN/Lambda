//fun main() {
//
//    println(cc)
//    x()
//    println(x())
//    convertFive { ee, e -> (ee + e) * 1.8 + 32 }
//
//    combine({it * 2}, {it * 2})
//
//    val sh = :: looked
//    println(sh("s"))
//
//    foo(1) { println("hello") }     // Используется значение по умолчанию baz = 1
//    foo(qux = { println("hello") }) // Используется оба значения по умолчанию: bar = 0 и baz = 1
//    foo { println("hello") }   // Используется оба значения по умолчанию: bar = 0 и baz = 1
//
//
//    fooo( biv = 2) { println("f") }
//
//}
//fun foo(
//    bar: Int = 0,
//    baz: Int = 1,
//    qux: () -> Unit,
//) { /*...*/ }
//fun fooo (be : Int = 1, biv : Int , q: () -> Unit) { }
//
//
//fun looked  (asa : String) = 1
//
//    val c = { x: Int, y: Int -> x + y }
//    // val result = c(5, 6)
//    val a: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
//
//    val b: () -> String = { "Hello" }
//
//
//    val x: () -> String = { "Pow!" }
//
//
//    val cc = convert((20.0), { it * 1.8 + 32 }, y = 20) { it * 5 }
//
//
//
//
//
//
//typealias D = (Double) -> Double
////fun combine(lambda1: D, lambda2:D): D {
////
////
////
////    val res = lambda1(2.0)
////    val res2 = lambda2(2.0)
////    val res3 = res + res2
////    return { x: Double -> lambda2(lambda1(x)) }
////}
//fun convert(x: Double, converter: (Double) -> Double, y: Int, xx: (Int) -> Int): Double {
//
//    val result = converter(x)
//    val result2 = xx(y)
//    println("$x is converted to ${result + result2 * y} ")
//    return (result + result2)
//
//}
//
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
//
//
//
//
//
////fun main(args: Array<String>) {
////    val x = 20
////    val y = 2.3
////    var lam4 = { y: Int -> (y/2).toDouble() }
////    print(lam4(x))
////    lam4 = { it + 6.3 }
////    print(lam4(7))
//////}
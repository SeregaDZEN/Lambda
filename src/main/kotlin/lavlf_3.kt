//import java.io.Serializable
//import kotlin.Pair
//
//fun main (){
//        val regex = "\\s+".toRegex()  // 1 or more whitespace character (space, tabs etc.)
//        val str = "1 2\t\t3  4\t5  6"
//    val nums = str.split(regex).map { it.toInt() }.toMutableList()
//    println(nums.joinToString()) // 1, 2, 3, 4, 5, 6
//
//    val aa = mutableMapOf(1 to "Sting")
//
//val position : Pair<Double,Double> = 55.55 to 37.6
//    println(position)
//
//    val posit : Loc = 22.22 x 22.22
//    println(posit)
//
//    val ress : Loc = posit  + Loc(1.0, 1.0)
//    println(ress)
//}
// data class Loc(val lat : Double, val long : Double)
//infix fun Double.x(that : Double) = Loc(this,that) // пара
//
//operator fun Loc.plus(other : Loc) = Loc(lat= lat + other.lat, long = long + other.long)
//
//inline fun <T> MutableList(
//    size: Int,
//    init: (index: Int) -> T
//) {
//
//}



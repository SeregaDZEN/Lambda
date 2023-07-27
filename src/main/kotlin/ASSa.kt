fun main(){

    val numberFlow = listOf(1, 2, 3, 4, 5)
    val reducedValue = numberFlow.reduce{ a, b -> a + b }
    println(reducedValue)   // 15
}
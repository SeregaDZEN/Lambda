  typealias DD = (Double) -> Double

fun convert(
    x: Double,
    converter: DD
): Double {
    val result = converter(x)
    println("$x is converted to $result")
    return result
}

fun getConversionLambda(str: String): DD {
    if (str == "CentigradeToFahrenheit") {
        return { it * 1.8 + 32 }
    } else if (str == "KgsToPounds") {
        return { it * 2.204623 }
    } else if (str == "PoundsToUSTons") {
        return { it / 2000.0 }
    } else {
        return { it }
    }
}

fun combine(lambda1: DD, lambda2: DD): DD {
    return { x: Double -> lambda2(lambda1(x)) }
}

fun main(args: Array<String>) {

    val square: DD = { x -> x * x }
    val increment: DD = { x -> x + 1 }

    val combined: DD = combine(square, increment)

    val result = combined(5.0)
    println("Result: $result") // Output: Result: 26.0

}

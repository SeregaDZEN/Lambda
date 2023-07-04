data class Person(var name: String, var age: Int, var city: String) {
    fun moveTo(newCity: String) {
        city = newCity
    }

    fun incrementAge() {
        age++
    }
}

fun main() {
    val d = Person("Alice", 20, "Amsterdam")
    println(d)
    d.moveTo("London")
    d.incrementAge()
    println(d)

}

fun main() {

////    val c : String = "1234"
////    println( c.lastIndex)
////    println( c.length)
////
////
////val a =  A(1)
////    a.age = 11
////    println(a.age)
//    val rr = mutableListOf("2",1, false,Post())
//
//
//    val rrr : MutableCollection<Any> = rr
//
//
//
//
//    val list = mutableListOf(1, 2, 3)
//    println(list)
//    list.swap(0, 1)
//    println(list)
//    list.noop()
//
//
//    val col : MutableCollection<Int> = list
//    col.noop()
//
//
//    val strLisst = mutableListOf("one", "two")
//    println(strLisst)
//    strLisst.swap(0, 1)
//    println(strLisst)
    val a1 = Pi(1, 1)
    val a2 = Pi(1, 1)
    println(a1.hashCode())
    println(a2.hashCode())
    println(a1 == a2)
    println(a1 === a2)

    val listPost = mutableListOf(Post(1, 2), Post(2, 2), Post(3, 0))

    val l = listPost.filter(fun(post: Post) = post.like > 0)
    println(l)
    listPost.filter { it.like > 0 }
    listPost.filterIndexed { _, post -> post.like > 0 }
}



fun <E> MutableList<E>.swap(index0: Int, index1: Int) {
    val e0 = get(index0)
    val e1 = get(index1)

    this[index0] = e1
    this[index1] = e0


}

fun <E> MutableList<E>.noop() {
    println("list")
}

fun <E> MutableCollection<E>.noop() {
    println("col")
}

class A(val a: Int) {
    var age: Int = 18
        set(value) {
            println("Call setter")
            if ((value > 0) and (value < 110))
                field = value
        }
        get() {
            println("Call getter")
            println(field)
            return field
        }

}

val <T> List<T>.lastIndex: Int
    get() = this.size - 1

data class Post(val id: Int, val like: Int)

fun printAll(strings: MutableCollection<String>) {
    for (s in strings) print("$s ")
    println()
}

data class Pi(val pi: Int, val li: Int)
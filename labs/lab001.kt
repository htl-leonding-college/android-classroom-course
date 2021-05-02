fun main() {
    val list = generateSequence(0) {
        println("Calculating ${it + 10}")
        it + 10
    }

    val first10 = list.take(10).toList()
    val first20 = list.take(20).toList()

    println(first10)
    println(first20)

}

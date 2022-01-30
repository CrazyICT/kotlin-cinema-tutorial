const val TEN = 10
const val HUNDRED = 100

fun main() {
    val numbers = MutableList(100) { 0 }

    numbers[0] = 1
    numbers[9] = TEN
    numbers[99] = HUNDRED

    // do not touch the lines below 
    println(numbers.joinToString())
}
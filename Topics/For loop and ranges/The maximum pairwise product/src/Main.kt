import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val range = mutableListOf<Int>()
    var data = Int.MIN_VALUE

    for (x in 1..n) {
        data = scanner.nextInt()
        range.add(data)
    }

    if (n > 1) {
        range.sort()
        val high = range.maxOrNull()!!.toInt()
        val secondHigh = range.get(range.lastIndex - 1)

        println(high * secondHigh)
    } else {
        println(data)
    }

}

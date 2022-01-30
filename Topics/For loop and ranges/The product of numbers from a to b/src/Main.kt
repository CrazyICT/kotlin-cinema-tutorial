import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextLong()
    val b = scanner.nextLong()
    var multiply: Long = 1

    for (i in a until b) {
        multiply = i * multiply
    }

    println(multiply)
}
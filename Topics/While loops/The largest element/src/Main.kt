import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var currentInt = Int.MIN_VALUE

    var result = Int.MIN_VALUE

    while (currentInt != 0) {
        currentInt = scanner.nextInt()

        if (currentInt > result) {
            result = currentInt
        }
    }

    println(result)
}
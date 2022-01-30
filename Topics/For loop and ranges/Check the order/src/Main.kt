import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = readLine()!!.toInt()
    var previous = Int.MIN_VALUE
    var result = true

    for (i in 1..n) {
        val data = scanner.nextInt()

        if (data > previous) {
            previous = data
        } else {
            result = false
            break
        }
    }

    println(if (result) "YES" else "NO")
}
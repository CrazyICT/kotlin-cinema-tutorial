fun main() {
    val n = readLine()!!.toInt()

    val arrayF = intArrayOf(0, 1, 2, 3, 5, 8, 13, 21, 34, 55)
    val arrayT = intArrayOf(0, 1, 3, 6, 10, 15, 21, 28, 36, 45)
    val arrayP = intArrayOf(1, 10, 100, 1000, 10000, 100000)

    when (n) {
        in arrayF -> println("F")
        in arrayT -> println("T")
        in arrayP -> println("P")
        else -> println("N")
    }
}
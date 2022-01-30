fun main() {
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    val num3 = readLine()!!.toInt()

    val result = listOf(num1, num2, num3)
    val r = result.count { p: Int ->
        p > 0
    } == 1

    println(r)
}
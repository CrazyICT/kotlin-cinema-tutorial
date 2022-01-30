import java.util.Collections.rotate

fun main() {
    val numbers: MutableList<Int> = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    val rotate = readLine()!!.toInt()

    rotate(numbers, rotate)

    println(numbers.joinToString(" "))
}
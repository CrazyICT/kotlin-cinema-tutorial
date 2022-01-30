fun main() {
    val numbers: MutableList<Int> = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    val m = readLine()!!.toInt()
    println(numbers.count { i -> i == m })
}
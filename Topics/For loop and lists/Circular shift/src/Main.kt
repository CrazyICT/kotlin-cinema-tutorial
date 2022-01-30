fun main() {
    val numbers: MutableList<Int> = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }

    numbers.add(0, numbers.last())
    numbers.removeLast()

    println(numbers.joinToString(" "))
}
fun main() {
    val number = readLine()!!.toInt()
    val range = readLine()!!.toInt()..readLine()!!.toInt()

    println(number in range)
}
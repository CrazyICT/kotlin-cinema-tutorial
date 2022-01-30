fun main() {
    val r1 = readLine()!!.toInt()
    val r2 = readLine()!!.toInt()
    val r3 = readLine()!!.toInt()
    val r4 = readLine()!!.toInt()
    val number = readLine()!!.toInt()

    println(number in r1..r2 || number in r3..r4)
}
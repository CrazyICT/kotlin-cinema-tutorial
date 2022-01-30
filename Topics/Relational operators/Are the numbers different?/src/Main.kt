fun main() {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()

    val result = !number1.equals(number2) && !number1.equals(number3) && !number2.equals(number3)

    println(result)
}
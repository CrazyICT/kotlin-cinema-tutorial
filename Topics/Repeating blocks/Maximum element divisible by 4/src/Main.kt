fun main() {
    val total = readLine()!!.toInt()
    var result = 0

    repeat(total) {
        val number = readLine()!!.toInt()
        if (number % 4 == 0 && number > result) {
            result = number
        }
    }

    println(result)
}
fun main() {
    val num = readLine()!!.toInt()

    var result = 0

    if (num % 2 == 0) {
        result = num + 2
    } else {
        result = num + 1
    }

    println(result)
}
fun main() {
    val n = readLine()!!.toInt()
    var result = 0
    repeat(n) {
        result += readLine()!!.toInt()
    }

    println(result)
}
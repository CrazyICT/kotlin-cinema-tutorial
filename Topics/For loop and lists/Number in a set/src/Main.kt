fun main() {
    val numbers: MutableList<Int> = mutableListOf()
    val n = readLine()!!.toInt()

    for (x in 1..n) {
        numbers.add(readLine()!!.toInt())
    }

    val m = readLine()!!.toInt()

    println(
        if (numbers.find { i -> i == m } == null) {
            "NO"
        } else {
            "YES"
        }
    )
}
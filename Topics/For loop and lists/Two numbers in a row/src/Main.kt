fun main() {
    val numbers: MutableList<Int> = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    val (p, m) = readLine()!!.split(" ")
    var previous = 0
    var next = "YES"

    numbers.forEach { it ->
        if (p.toInt() == it && m.toInt() == previous) {
            next = "NO"
        } else if (p.toInt() == previous && m.toInt() == it) {
            next = "NO"
        }

        previous = it
    }

    println(next)
}
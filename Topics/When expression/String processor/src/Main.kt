fun main() {
    val a = readLine()!!.toString()
    val b = readLine()!!.toString()
    val c = readLine()!!.toString()

    when (b) {
        "equals" -> println(a == c)
        "plus" -> println(a + c)
        "endsWith" -> println(a.endsWith(c))
        else -> println("Unknown operation")
    }
}
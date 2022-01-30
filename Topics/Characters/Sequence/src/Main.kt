fun main() {
    var a: Char = readLine()!!.first()
    var b: Char = readLine()!!.first()
    val c: Char = readLine()!!.first()

    println(b == ++a && c == ++b)
}
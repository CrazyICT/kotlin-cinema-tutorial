fun main() {
    // sum of any of the 2 side lengths exceeds the 3rd side it is a triangle.

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    println(if ((a + b) > c && (a + c) > b && (b + c) > a) {
        "YES"
    } else {
        "NO"
    })
}
fun main() {
    var i = readLine()!!.toInt()
    var r = 0

    while (i != 0) {
        var digit = i % 10
        r = r * 10 + digit
        i /= 10
    }

    println(r)
}
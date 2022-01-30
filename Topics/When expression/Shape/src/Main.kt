fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    var x = ""

    when (a) {
        1 -> x = "square"
        2 -> x = "circle"
        3 -> x = "triangle"
        4 -> x = "rhombus"
    }

    if (x == "") {
        println("There is no such shape!")
    } else {
        println("You have chosen a $x")
    }
}
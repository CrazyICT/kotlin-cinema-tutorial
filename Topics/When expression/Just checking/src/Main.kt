fun main() {
    when (readLine()!!.toInt()) {
        2 -> println("Yes!")
        in intArrayOf(1, 3, 4) -> println("No!")
        else -> println("Unknown number")
    }
}
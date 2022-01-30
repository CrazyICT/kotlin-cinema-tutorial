fun main() {
    val n = readLine()!!.toInt()
    val x = readLine()!!.toInt()
    
    if (x <= 0) {
        println("Division by zero, please fix the second argument!")
    } else {
        println(n / x)
    }
}

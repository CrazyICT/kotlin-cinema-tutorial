fun main() {    
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // Do not touch lines above
    // Write only exchange actions here.
    val a = numbers.first()
    val b = numbers.last()

    numbers[numbers.size - 1] = a
    numbers[0] = b

    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}
fun main() {
    val char = readLine()!!.first()
    println(char in ('\u0031' .. '\u0039') || char.isUpperCase())
}
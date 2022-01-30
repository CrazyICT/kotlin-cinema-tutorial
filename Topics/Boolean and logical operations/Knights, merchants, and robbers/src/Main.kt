fun main() {    
    val firstAnswer = readLine().toBoolean() // read other values in the same way
    // write your code here

    val secondAnswer = readLine().toBoolean()
    val confession = readLine().toBoolean()

    println(firstAnswer == secondAnswer xor confession)
}
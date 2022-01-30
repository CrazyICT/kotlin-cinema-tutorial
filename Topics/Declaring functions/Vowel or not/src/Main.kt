// write your function here

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}

fun isVowel(char: Char): Boolean {
    val vowels = mutableListOf<Char>('a', 'e', 'i', 'o', 'u')
    return vowels.contains(char.lowercaseChar())
}
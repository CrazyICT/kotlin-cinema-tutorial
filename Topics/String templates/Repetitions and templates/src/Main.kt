fun main() {
    val data = readLine()!!.toString()
    val length = data.length

    println("$length repetitions of the word $data: ${data.repeat(length)}")
}
const val LARGER = 1
const val SMALLER = -1
const val PERFECT = 0

fun main() {
    val count = readLine()!!.toInt()

    var larger = 0
    var smaller = 0
    var perfect = 0

    repeat(count) {
        val grade = readLine()!!.toInt()

        when (grade) {
            LARGER -> larger++
            SMALLER -> smaller++
            PERFECT -> perfect++
        }
    }

    println("$perfect $larger $smaller")
}
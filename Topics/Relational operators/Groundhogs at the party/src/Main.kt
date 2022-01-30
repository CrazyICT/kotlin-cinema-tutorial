const val WEEKEND_MIN = 15
const val WEEKEND_MAX = 25
const val OUT_WEEKEND_MIN = 10
const val OUT_WEEKEND_MAX = 20

fun main() {
    val cups = readLine()!!.toInt()
    val isWeekend = readLine()!!.toBoolean()

    println(if (isWeekend) cups in WEEKEND_MIN..WEEKEND_MAX else cups in OUT_WEEKEND_MIN..OUT_WEEKEND_MAX)
}
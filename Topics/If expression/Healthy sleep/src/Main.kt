fun main() {
    val minSleepHours = readLine()!!.toInt()
    val maxSleepHours = readLine()!!.toInt()

    val sleepHours = readLine()!!.toInt()

    val result = if (sleepHours in minSleepHours..maxSleepHours) {
        "Normal"
    } else if (sleepHours < maxSleepHours) {
        "Deficiency"
    } else {
        "Excess"
    }

    println(result)
}
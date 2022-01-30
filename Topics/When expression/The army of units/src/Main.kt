fun main() {
    val number = readLine()!!.toInt()

    println(
        when {
            number in 1..4 -> "few"
            number in 5..9 -> "several"
            number in 10..19 -> "pack"
            number in 20..49 -> "lots"
            number in 50..99 -> "horde"
            number in 100..249 -> "throng"
            number in 250..499 -> "swarm"
            number in 500..999 -> "zounds"
            number >= 1000 -> "legion"
            else -> "no army"
        }
    )
}
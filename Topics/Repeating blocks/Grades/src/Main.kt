fun main() {
    val students = readLine()!!.toInt()
    var a = 0
    var b = 0
    var c = 0
    var d = 0

    repeat(students) {
        val grade = readLine()!!.toInt()

        if (grade == 2) d++
        if (grade == 3) c++
        if (grade == 4) b++
        if (grade == 5) a++
    }

    println("$d $c $b $a")
}
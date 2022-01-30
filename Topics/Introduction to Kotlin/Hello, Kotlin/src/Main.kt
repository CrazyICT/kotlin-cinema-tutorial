fun main() {
    val base = readLine()!!.toDouble()
    val height = readLine()!!.toDouble()
    val area = (base * height) / 2

    println(area)



//    val regex = "\\s+".toRegex()  // 1 or more whitespace character (space, tabs etc.)
//    val str = "1 2\t\t3  4\t5  6"
//    val nums = str.split(regex).map { it.toInt() }.toMutableList()
//    println(nums.joinToString()) // 1, 2, 3, 4, 5, 6


//    for (i in 1..3) {
//        for (j in 1..i) {
//            print(j)
//        }
//    }
//    val a = 10
//    val b = 12
//    val range = 17..19
//
//    println(16 in range)
//    println(17 in range)
//    println(18 in range)
//    println(19 in range)
//    println(20 in range)
//
//    val box = Box(3)
//    val box2 = box
//
//    println(box == box2)
//    box2.addBall()
//    println(box == box2)
//
//    repeat(5) {
//        println(it)
//    }
//
//    val n = readLine()!!.toInt()
//    var sum = 0
//
//    repeat(n) {
//        val next = readLine()!!.toInt()
//        sum += next
//    }
//
//    println(sum)
}

class Box(var int: Int) {

    fun addBall(){
       this.int++
    }
}

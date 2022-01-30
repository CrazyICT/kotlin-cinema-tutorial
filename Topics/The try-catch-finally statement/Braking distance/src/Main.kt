import java.lang.Math.abs

fun calculateBrakingDistance(v1: String, a: String): Int {
    // write your code here
    var result = -1
    try {
        result = v1.toInt() * v1.toInt() / abs(a.toInt() * 2)
    } catch (e: ArithmeticException) {
        println("The car does not slow down!")
    } catch (e: NumberFormatException) {
        println(e.message)
    }

    return result
}
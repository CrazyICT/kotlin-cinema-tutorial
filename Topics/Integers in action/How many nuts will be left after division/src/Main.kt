import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    // put your code here
    val squirrels = scanner.nextInt()
    val nuts = scanner.nextInt()

    println(nuts % squirrels)
}
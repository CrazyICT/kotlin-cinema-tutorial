import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine().split(" ")
    for(item in input) {
        if (item != "") println(item.trim())
    }
}
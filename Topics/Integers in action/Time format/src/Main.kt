fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
    // enter your code

    val days = totalSeconds / 86400

    val hours = (totalSeconds - days * 86400)  / 3600
    val m = (totalSeconds % 3600) / 60
    val secs = (totalSeconds % 3600) % 60

    println("$hours:$m:$secs")
}
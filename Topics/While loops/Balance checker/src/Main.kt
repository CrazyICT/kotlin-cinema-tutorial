fun main() {
    var balance = readLine()!!.toInt()
    val withdraw = readLine()!!.split(" ")
    var result = 0
    
    for (amount in withdraw) {
        balance = balance - amount.toInt()
        
        if (balance < 0) {
            balance = balance + amount.toInt()
            result = amount.toInt()
            break
        }
    }
    
    if (result == 0) {
        println("Thank you for choosing us to manage your account! Your balance is $balance.")
    } else {
        println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $result.")
    }
}

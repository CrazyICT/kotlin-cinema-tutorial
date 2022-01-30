fun parseCardNumber(cardNumber: String): Long {
    val regex = "[0-9]{4}+\\s+[0-9]{4}+\\s+[0-9]{4}+\\s+[0-9]{4}".toRegex()

    if (!regex.matches(cardNumber)) throw Exception()

    val result = cardNumber.replace(" ", "")

    return result.toLong()
}
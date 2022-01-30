package cinema

const val pricePerSeatHigh = 10
const val pricePerSeatLow = 8

var roomData: Room = Room(0, 0)

val seats: MutableList<Seat> = mutableListOf()

data class Room(
    val rows: Int,
    val seats: Int
)

data class Seat(
    val row: Int,
    val seat: Int,
    var price: Int? = 0
)

fun main() {
    askRoomData()
    menu()
}

fun menu() {
    println()
    println("1. Show the seats")
    println("2. Buy a ticket")
    println("3. Statistics")
    println("0. Exit")

    when(readLine()!!.toInt()) {
        1 -> drawRoom()
        2 -> askSeat()
        3 -> statistics()
        0 -> return
    }

    menu()
}

fun askRoomData() {
    println("Enter the number of rows:")
    val rows = readLine()!!.toInt()

    println("Enter the number of seats in each row:")

    val seats = readLine()!!.toInt()

    roomData = Room(rows, seats)
}

fun seatQ(): Seat {
    println()
    println("Enter a row number:")
    val row = readLine()!!.toInt()

    println("Enter a seat number in that row:")

    val seatInput = readLine()!!.toInt()
    val seat = Seat(row, seatInput)

    return seat
}

fun askSeat() {

    val seat = seatQ()

    seats.forEach {
        if (it.row == seat.row && it.seat == seat.seat) {
            println("That ticket has already been purchased!")
            askSeat()
            return
        }
    }

    if (seat.row > roomData.rows || seat.seat > roomData.seats) {
        println("Wrong input!")
        askSeat()
        return
    }

    val price = calcPrice(roomData, seat)
    seat.price = price
    seats.add(seat)

    println("Ticket price: $${calcPrice(roomData, seat)}")
}

fun drawRoom() {
    println("")
    println("Cinema:")

    for (row in 0 .. roomData!!.rows) {
        if (row == 0) {
            print("  ")
            for (seatItem in 1..roomData!!.seats) {
                print("${seatItem} ")
            }
        } else {
            print("${row} ")

            for (seatItem in 1..roomData!!.seats) {
                var sb = "S"

                var x = seats.filter {
                    (it.row == row && it.seat == seatItem)
                }.count()
                if (x > 0) {
                    sb = "B"
                }

                print("$sb ")
            }
        }
        println()
    }
}

fun calcPrice(room: Room?, seat: Seat?): Int {
    var price = pricePerSeatHigh

    if (room!!.rows * room!!.seats > 60) {
        if (seat!!.row in 1..(room!!.rows / 2)) {
            price = pricePerSeatHigh
        } else {
            price = pricePerSeatLow
        }
    }

    return price
}

fun statistics() {
    var perc = (seats.count().toDouble() / (roomData.seats * roomData.rows) ) * 100.0
    val income = seats.sumOf { it.price ?: 0 }

    println("Number of purchased tickets: ${seats.count()}")
    println("Percentage: ${"%.2f".format(perc)}%")
    println("Current income: \$$income")
    println("Total income: \$${calcProfit()}")
}

fun calcProfit(): Int {
    var totalPrice: Int
    var firstHalf: Int
    var secondHalf: Int

    if (roomData!!.rows * roomData!!.seats <= 60) {
        totalPrice = roomData!!.seats * roomData!!.rows * pricePerSeatHigh
    } else {

        firstHalf = (roomData!!.rows / 2) * roomData!!.seats * pricePerSeatHigh
        secondHalf = (roomData!!.rows  - roomData!!.rows / 2) * roomData!!.seats * pricePerSeatLow

        totalPrice = firstHalf + secondHalf
    }

    return totalPrice
}
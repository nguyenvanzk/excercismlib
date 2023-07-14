import java.time.LocalDate
import java.time.LocalDateTime

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
//    val current = LocalDate.now()
//    val currentTime = LocalDateTime.now()
//    println("$current => ${Gigasecond(current).date}")
//    println("$currentTime => ${Gigasecond(currentTime).date}")

//    println("Score for a => ${ScrabbleScore.scoreWord("a")}")


//    for (item in data()) {
//        println("Roman number for ${item[0]} -> ${RomanNumerals.value(item[0] as Int)} | <- ${item[1]} ")
//
//    }
//    println("Is equir -> ${Triangle(2,2, 2).isEquilateral}")
    val matrix = Matrix2(
        listOf(
            listOf(1, 2, 3),
            listOf(3, 1, 2),
            listOf(2, 3, 1)
        )
    )
    println("Saddle points => ${matrix.saddlePoints}")
}
fun data() = listOf(
    arrayOf(1, "I"),
    arrayOf(2, "II"),
    arrayOf(3, "III"),
    arrayOf(4, "IV"),
    arrayOf(5, "V"),
    arrayOf(6, "VI"),
    arrayOf(9, "IX"),
    arrayOf(27, "XXVII"),
    arrayOf(48, "XLVIII"),
    arrayOf(49, "XLIX"),
    arrayOf(59, "LIX"),
    arrayOf(93, "XCIII"),
    arrayOf(141, "CXLI"),
    arrayOf(163, "CLXIII"),
    arrayOf(402, "CDII"),
    arrayOf(575, "DLXXV"),
    arrayOf(911, "CMXI"),
    arrayOf(1024, "MXXIV"),
    arrayOf(3000, "MMM")
)



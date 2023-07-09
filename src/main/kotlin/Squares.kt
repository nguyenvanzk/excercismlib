class Squares(private val input: Int) {

    fun sumOfSquares(): Int {
        var sum = 0
        for (i in 1..this.input) {
            sum += i*i
        }
        return sum
    }

    fun squareOfSum(): Int {
        var sum = 0
        for (i in 1..this.input) {
            sum += i
        }
        return sum*sum
    }

    fun difference(): Int {
        return squareOfSum() - sumOfSquares()
    }
}

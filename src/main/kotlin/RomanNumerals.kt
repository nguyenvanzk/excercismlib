object RomanNumerals {

    fun value(n: Int): String {
        var result = ""

        var unitPoint = n % 10
        var tenPoint = n / 10
        if (tenPoint > 10) {
            tenPoint %= 10
        }
        var hundredPoint = n / 100
        if (hundredPoint > 10) {
            hundredPoint %= 10
        }
        var thousandPoint = n / 1000

        when(thousandPoint) {
            in 0..3-> result += "M".repeat(thousandPoint)
        }

        when(hundredPoint) {
            in 1..3 -> result += "C".repeat(hundredPoint)
            4 -> result += "CD"
            5 -> result += "D"
            in 6..8-> result += "D" + "C".repeat(hundredPoint - 5)
            9 -> result += "CM"
        }

        when (tenPoint) {
            in 1..3 -> result += "X".repeat(tenPoint)
            4 -> result += "XL"
            5 -> result += "L"
            in 6..8 -> result += "L" + "X".repeat(tenPoint - 5)
            9-> result += "XC"
        }

        when (unitPoint) {
            in 1..3 -> result += "I".repeat(unitPoint)
            4 -> result += "IV"
            in 5..8 -> result += "V" + "I".repeat(unitPoint - 5)
            in 9..10 -> result += "I".repeat(10 - unitPoint) + "X"
        }


        return result
    }
}

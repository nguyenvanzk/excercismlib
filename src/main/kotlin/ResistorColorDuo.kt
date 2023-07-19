object ResistorColorDuo {

    fun value(vararg colors: Color): Int {

        var result = 0
        colors.forEachIndexed { index, color ->
            if (index <= 1) {
                result = result * 10 + color.ordinal
            }
        }
        return result
    }
}


enum class Color {
    BLACK,
    BROWN,
    RED,
    ORANGE,
    YELLOW,
    GREEN,
    BLUE,
    VIOLET,
    GREY,
    WHITE
}

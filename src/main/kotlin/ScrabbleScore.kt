object ScrabbleScore {

    fun scoreLetter(c: Char): Int {
        val score = when (c) {
            in "AEIOULNRST" ->  1
            in "DG" -> 2
            in "BCMP" -> 3
            in "FHVWY" -> 4
            'K' -> 5
            in "JX"-> 8
            in "QZ" -> 10
            else -> 0
        }

        return score

    }

    fun scoreWord(word: String): Int {
        var score = 0
        for (char in word.toUpperCase()) {
            score += scoreLetter(char)
        }

        return  score
    }
}

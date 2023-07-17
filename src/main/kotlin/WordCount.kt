object WordCount {

    fun phrase(phrase: String): Map<String, Int> {
        val delimiters = arrayOf(":", "!", "?", "\t", "\n", " ", ",", ".")
        val tokens = phrase.split(*delimiters)
        val result = hashMapOf<String, Int>()

        println("Raw => $phrase Token => $tokens")

        for (token in tokens) {
            if (delimiters.contains(token)) {
                continue
            }
            val value = result[token] ?: 0
            result[token] = value + 1
        }

        return result
    }
}

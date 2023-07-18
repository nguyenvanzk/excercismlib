object WordCount {

    fun phrase1(phrase: String): Map<String, Int> {
        val delimiters = arrayOf(":", "!", "?", "\t", "\n", " ", ",", "." )
        val tokens = phrase.toLowerCase().split(*delimiters)
        val result = hashMapOf<String, Int>()

        println("Raw => $phrase Token => $tokens")

        for (token in tokens) {
            val word = token.removeSurrounding("'")
                .replace("&", "")
                .replace("@", "")
                .replace("$", "")
                .replace("%", "")
                .replace("^", "")


            if (delimiters.contains(word) || word == "") {
                continue
            }
            val value = result[word] ?: 0
            result[word] = value + 1
        }

        return result
    }

    fun phrase(phrase: String): Map<String, Int> {
        return phrase.split("\t", "\n", ",", " ")
            .filter { it.trim().isNotEmpty() }
            .map { it.replace("""[:,?,!,.,&,@,\,$,%,^]""".toRegex(), "") }
            .map { it.trim('\'') }
            .groupingBy { it.lowercase() }.eachCount()
    }
}

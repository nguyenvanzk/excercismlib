object Pangram {

    fun isPangram(input: String): Boolean {
        val keepMap = mutableSetOf<Char>()
        val az = ('A' .. 'Z')

        keepMap.addAll(input.toUpperCase().toList().filter { az.contains(it) })
        println("map => $keepMap")
        return keepMap.count() == az.count()
    }
}

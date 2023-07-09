class Matrix(private val matrixAsString: String) {
    /*
    1-based index
     */


    fun column(colNr: Int): List<Int> {
        val rows = this.matrixAsString.split('\n')
        val result = mutableListOf<Int>()
        for (row in rows) {
            val array = row.split(" ")
            result.add(array[colNr - 1].toInt())
        }

        return  result
    }

    fun row(rowNr: Int): List<Int> {
        val rows = this.matrixAsString.split('\n')
        val row = rows[rowNr - 1].split(" ")
        val result = mutableListOf<Int>()
        for (char in row) {
           result.add(char.toInt())
        }

        return  result
    }
}

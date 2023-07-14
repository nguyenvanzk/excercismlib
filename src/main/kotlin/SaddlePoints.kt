data class MatrixCoordinate(val row: Int, val col: Int)


class Matrix2(private val initialize: List<List<Int>>) {
    val saddlePoints: Set<MatrixCoordinate>
        get() {
            var row = 0
            var col = 0
            var columns = hashMapOf<Int, Int>()
            var tempCol = hashMapOf<Int, Int>()

            var maxValue = 0

            initialize.forEachIndexed { _, item ->
                val maxRow = item.max()

                if (maxRow > maxValue) {
                    maxValue = maxRow
                    tempCol[item.indexOf(maxValue)] = maxValue
                }
            }

             columns = tempCol.filter { item ->
                item.value == maxValue
            } as HashMap<Int, Int>


            for (col in columns) {
               initialize.forEachIndexed { _, item ->

               }
            }

//            val columns = mutableListOf<Int>()
            initialize.forEachIndexed { _, item ->
//                columns.add(item[col])
            }

//            val minValue = columns.min()
//            row = columns.indexOf(minValue)

            return setOf(MatrixCoordinate(row + 1, col + 1))
        }
}

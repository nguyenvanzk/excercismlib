import java.util.Collections.emptySet
import kotlin.test.assertEquals
import kotlin.test.Test
import kotlin.test.Ignore
class Matrix2Test {
    @Test
    fun `single saddle point`() =
        assertSaddlePointsEqual(
            Matrix2(
                listOf(
                    listOf(9, 8, 7),
                    listOf(5, 3, 2),
                    listOf(6, 6, 7)
                )
            ),
            setOf(
                MatrixCoordinate(2, 1)
            )
        )
//
    @Test
    fun `no saddle points for empty Matrix2`() =
        assertSaddlePointsEqual(
            Matrix2(listOf(emptyList())),
            emptySet()
        )
//
    @Test
    fun `no saddle points for nonempty Matrix2`() =
        assertSaddlePointsEqual(
            Matrix2(
                listOf(
                    listOf(1, 2, 3),
                    listOf(3, 1, 2),
                    listOf(2, 3, 1)
                )
            ),
            emptySet()
        )

    @Test
    fun `multiple saddle points in a column`() =
        assertSaddlePointsEqual(
            Matrix2(
                listOf(
                    listOf(4, 5, 4),
                    listOf(3, 5, 5),
                    listOf(1, 5, 4)
                )
            ),
            setOf(
                MatrixCoordinate(1, 2),
                MatrixCoordinate(2, 2),
                MatrixCoordinate(3, 2)
            )
        )

    @Test
    fun `multiple saddle points in a row`() =
        assertSaddlePointsEqual(
            Matrix2(
                listOf(
                    listOf(6, 7, 8),
                    listOf(5, 5, 5),
                    listOf(7, 5, 6)
                )
            ),
            setOf(
                MatrixCoordinate(2, 1),
                MatrixCoordinate(2, 2),
                MatrixCoordinate(2, 3)
            )
        )

    @Test
    fun `saddle point in bottom right corner`() =
        assertSaddlePointsEqual(
            Matrix2(
                listOf(
                    listOf(8, 7, 9),
                    listOf(6, 7, 6),
                    listOf(3, 2, 5)
                )
            ),
            setOf(
                MatrixCoordinate(3, 3)
            )
        )

    @Test
    fun `saddle points in a single column Matrix2`() =
        assertSaddlePointsEqual(
            Matrix2(
                listOf(
                    listOf(2),
                    listOf(1),
                    listOf(4),
                    listOf(1)
                )
            ),
            setOf(
                MatrixCoordinate(2, 1),
                MatrixCoordinate(4, 1)
            )
        )

    @Test
    fun `saddle points in a single row Matrix2`() =
        assertSaddlePointsEqual(
            Matrix2(
                listOf(
                    listOf(2, 5, 3, 5)
                )
            ),
            setOf(
                MatrixCoordinate(1, 2),
                MatrixCoordinate(1, 4)
            )
        )
}
private fun assertSaddlePointsEqual(matrix: Matrix2, coordinates: Set<MatrixCoordinate>) =
    assertEquals(coordinates, matrix.saddlePoints)

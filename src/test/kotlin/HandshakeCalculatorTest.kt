import kotlin.test.assertEquals
import kotlin.test.Test

class HandshakeCalculatorTest {
    @Test
    fun testThatInput1YieldsAWink() {
        assertEquals(
            listOf(Signal.WINK),
            HandshakeCalculator.calculateHandshake(1)
        )
    }
}
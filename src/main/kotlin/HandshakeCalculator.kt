object HandshakeCalculator {
    fun calculateHandshake(number: Int): List<Signal> {
        val signals = mutableListOf<Signal>()

        if (number and 0b00001 == 0b1) {
            signals.add(Signal.WINK)
        }

        if (number and 0b00010 == 0b10) {
            signals.add(Signal.DOUBLE_BLINK)
        }

        if (number and 0b00100 == 0b100) {
            signals.add(Signal.CLOSE_YOUR_EYES)
        }

        if (number and 0b01000 == 0b1000) {
            signals.add(Signal.JUMP)
        }

        if (number and 0b10000 == 0b10000) {
            signals.reverse()
        }

        return signals
    }
}

enum class Signal( val desc: String) {
    WINK("wink"),
    DOUBLE_BLINK("double blink"),
    CLOSE_YOUR_EYES("close your eyes"),
    JUMP("jump"),
    REVERSE_ACTIONS("Reverse the order of the operations in the secret handshake.")
}
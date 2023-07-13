import java.lang.IllegalArgumentException

class Triangle<out T : Number>(val a: T, val b: T, val c: T) {

    init {
        if (a.toDouble() == 0.0 || b.toDouble() == 0.0 || c.toDouble() == 0.0) {
            throw IllegalArgumentException("Invalid triangle")
        }

        if (a.toDouble() + b.toDouble() <= c.toDouble() ||
            a.toDouble() + c.toDouble() <= b.toDouble() ||
            c.toDouble() + b.toDouble() <= a.toDouble() ) {
            throw IllegalArgumentException("Invalid triangle")
        }
    }

    val isEquilateral: Boolean
        get() = a.toDouble() == b.toDouble() && b.toDouble() == c.toDouble()
    val isIsosceles: Boolean
        get() {
            return a.toDouble() == b.toDouble() || a.toDouble() == c.toDouble() || b.toDouble() == c.toDouble()
        }
    val isScalene: Boolean
        get() = a.toDouble() != b.toDouble() && a.toDouble() != c.toDouble() && b.toDouble()!= c.toDouble()
}

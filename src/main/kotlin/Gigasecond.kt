import java.time.LocalDateTime
import java.time.LocalDate

class Gigasecond {
    private val internalDate: LocalDateTime

    constructor(date: LocalDate) {
        this.internalDate = date.atStartOfDay()
    }

    constructor(dateTime: LocalDateTime) {
        this.internalDate = dateTime
    }

    val date: LocalDateTime
        get() {
            return internalDate.plusSeconds(1000000000)
        }
}
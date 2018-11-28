import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class HelloTest {
    @Test
    fun whenHelloIsCalled_thenGreetsBack() {
        val hello = Hello()
        assertEquals("Hello", hello.greet())
    }
}
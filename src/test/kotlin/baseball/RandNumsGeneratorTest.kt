package baseball

import baseball.util.RandNumsGenerator
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RandNumsGeneratorTest {
    @Test
    fun `generate(1,9,3)함수 확인`() {
        val result = RandNumsGenerator().generate(1,9,3)
        println(result)
    }
}
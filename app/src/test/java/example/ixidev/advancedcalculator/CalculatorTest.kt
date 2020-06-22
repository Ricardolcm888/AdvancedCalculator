package example.ixidev.advancedcalculator

import org.junit.Test

import org.junit.Assert.*

/**
 * Created by ABDELMAJID ID ALI on 21/06/2020.
 * Email : abdelmajid.idali@gmail.com
 * Github : https://github.com/ixiDev
 */
class CalculatorTest {

    @Test
    fun parseTokens() {
        val calculator = Calculator()
        val tokens = calculator.parseTokens("2+8.5")

        assertEquals(listOf("2", "+", "8.5"), tokens)
    }

    @Test
    fun parseTokens2() {
        val calculator = Calculator()
        val tokens = calculator.parseTokens("2+8.5-99/7")

        assertEquals(listOf("2", "+", "8.5", "-", "99", "/", "7"), tokens)
    }

    @Test
    fun convertToPostFixTest() {
        val calculator = Calculator()
        val tokens = calculator.parseTokens("2+8.5")
        val postFix = calculator.convertToPostFix(tokens)
        assertEquals(listOf("2", "8.5", "+"), postFix)
    }

    @Test
    fun convertToPostFixTest2() {
        val calculator = Calculator()
        val tokens = calculator.parseTokens("6+7-8*2+962/7")
        val postFix = calculator.convertToPostFix(tokens)
        assertEquals(listOf("6", "7", "+", "8", "2", "*", "-", "962", "7", "/", "+"), postFix)
    }

    @Test
    fun computeResultTest() {
        val calculator = Calculator()
        val tokens = calculator.parseTokens("2+8.5-6/2")
        val postFix = calculator.convertToPostFix(tokens)
        val result = calculator.computeResult(postFix)
        assertEquals(7.5.toString(), result.toString())

    }
}
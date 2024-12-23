import org.example.ExpressionEvaluator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExpressionEvaluatorTest {

    @Test
    void testSimpleExpression() throws Exception {
        assertEquals(13.0, ExpressionEvaluator.evaluate("3 + 10"));
    }

    @Test
    void testWithParentheses() throws Exception {
        assertEquals(50.0, ExpressionEvaluator.evaluate("( 5 + 5 ) * 5"));
    }

    @Test
    void testWithDivision() throws Exception {
        assertEquals(3.0, ExpressionEvaluator.evaluate("9 / 3"));
    }

    @Test
    void testWithMultipleOperators() throws Exception {
        assertEquals(35.0, ExpressionEvaluator.evaluate("4 + 5 * 5 + 6"));
    }

    @Test
    void testWithInvalidExpression() {
        assertThrows(Exception.class, () -> ExpressionEvaluator.evaluate("4 + * 4"));
    }

    @Test
    void testWithDivisionByZero() {
        assertThrows(Exception.class, () -> ExpressionEvaluator.evaluate("10 / 0"));
    }

    @Test
    void testWithIncorrectParentheses() {
        assertThrows(Exception.class, () -> ExpressionEvaluator.evaluate("( 3 + 5" ));
    }
}
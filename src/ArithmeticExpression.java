public interface ArithmeticExpression {
    double compute();

    default void appendChild(ArithmeticExpression arithmeticExpression) {    }

    default void removeChild(ArithmeticExpression arithmeticExpression) {    }
}
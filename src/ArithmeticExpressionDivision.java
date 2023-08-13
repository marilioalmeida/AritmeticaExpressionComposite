public class ArithmeticExpressionDivision implements ArithmeticExpression {
    private final ArithmeticExpression x;
    private final ArithmeticExpression y;

    public ArithmeticExpressionDivision(ArithmeticExpression x, ArithmeticExpression y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double compute() {
        return x.compute() / y.compute();
    }
}
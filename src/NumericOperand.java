public class NumericOperand implements ArithmeticExpression {
    private double value;

    public NumericOperand(double value) {
        this.value = value;
    }

    @Override
    public double compute() {
        return value;
    }
}
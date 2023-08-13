import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeOperand implements ArithmeticExpression {

    private final List<ArithmeticExpression> operations = new ArrayList<>();



    public CompositeOperand() {
    }

    @Override
    public double compute() {

        double valor = 0;
        for (ArithmeticExpression item : operations) {
            valor += item.compute();
        }

        return valor;  // operations.stream().mapToDouble(Arithmetic::compute).sum();
    }

    @Override
    public void appendChild(ArithmeticExpression arithmeticExpression) {
        operations.add(arithmeticExpression);
    }

    @Override
    public void removeChild(ArithmeticExpression arithmeticExpression) {
        operations.remove(arithmeticExpression);
    }
}

public class Main {
    public static void main(String[] args) {

        //(5 + 2) + ( 5 - 2)
        ArithmeticExpression fivePlusTwo = new ArithmeticExpressionAddition(new NumericOperand(5), new NumericOperand(2));
        ArithmeticExpression fiveMinusTwo = new ArithmeticExpressionSubtraction(new NumericOperand(5), new NumericOperand(2));
        CompositeOperand co1 = new CompositeOperand();
        co1.appendChild(new ArithmeticExpressionAddition(fivePlusTwo, fiveMinusTwo));
        System.out.println("(5 + 2) + ( 5 - 2) = " + co1.compute());

        //(5 / 2) + (5 * 2) =
        ArithmeticExpression fiveDividedTwo = new ArithmeticExpressionDivision(new NumericOperand(5), new NumericOperand(2));
        ArithmeticExpression fiveMultipliedTwo = new ArithmeticExpressionMultiplication(new NumericOperand(5), new NumericOperand(2));

        CompositeOperand co2 = new CompositeOperand();
        co2.appendChild(new ArithmeticExpressionAddition(fiveDividedTwo, fiveMultipliedTwo));
        System.out.println("(5 / 2) + (5 * 2) = " + co2.compute());


        co1.appendChild(co2);
        //(5 + 2) + ( 5 - 2) + ( 5 / 2) + (5 * 2) =
        System.out.println("(5 + 2) + ( 5 - 2) + ( 5 / 2) + (5 * 2) = " +
                co1.compute());

        // (((1 + 2 ) -  1) / 2)
        ArithmeticExpression co3 = new CompositeOperand();
        co3.appendChild(new ArithmeticExpressionDivision( //  (((1 + 2 ) -  1) / 2)
                new ArithmeticExpressionSubtraction( // ((1 + 2 ) -  1)
                        new ArithmeticExpressionAddition(new NumericOperand(2), new NumericOperand(1)),//(1 + 2)
                        new NumericOperand(1)),
                new NumericOperand(2)
        ));

        System.out.println("(((1 + 2 ) -  1) / 2) = " + co3.compute());

        System.out.println("Validate Exercise Statement Expressions");
        // ((2 + 3) +1)
        ArithmeticExpression co4 = new CompositeOperand();
        co4.appendChild(new ArithmeticExpressionAddition(new ArithmeticExpressionAddition(new NumericOperand(2), new NumericOperand(3)),  new NumericOperand( 1)));
        System.out.println("((2 + 3) + 1) = " + co4.compute());

        // ((2 + 3) +1) + (4 * 6)
        co4.appendChild(new ArithmeticExpressionMultiplication(new NumericOperand(4), new NumericOperand(6)));
        System.out.println("((2 + 3) + 1) + (4 * 6) = " + co4.compute());

        System.out.println("Hello world!");

    }
}
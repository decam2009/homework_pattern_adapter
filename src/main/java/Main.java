public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.newFormula()
                .addOperand(5)
                .addOperand(6)
                .calculate(Calculator.Operation.MULT)
                .result);
        Ints intsCalculator = new IntsCalculator();
        System.out.println(intsCalculator.sum(5, 6));
        System.out.println(intsCalculator.mult(5,6));
        System.out.println(intsCalculator.pow(2,5));
    }
}

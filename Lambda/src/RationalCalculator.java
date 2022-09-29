public class RationalCalculator extends AbstractCalculator
{
    private final CalculationOperation add;
    private final CalculationOperation subtract;
    private final CalculationOperation multiply;
    private final CalculationOperation divide;

    public RationalCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide)
    {
        super(add, subtract, multiply, divide);
        this.add = add;
        this.subtract = subtract;
        this.multiply = multiply;
        this.divide = divide;
    }

    @Override
    public Number add(Number a, Number b)
    {
        return add.calc(a, b);
    }

    @Override
    public Number subtract(Number a, Number b)
    {
        return subtract.calc(a, b);
    }

    @Override
    public Number multiply(Number a, Number b)
    {
        return multiply.calc(a, b);
    }

    @Override
    public Number divide(Number a, Number b)
    {
        return divide.calc(a, b);
    }

    @Override
    public void printErg(Number erg)
    {
        System.out.println("Ergebnis:");
        int erg1 = (int) erg.getA();
        int erg2 = (int) erg.getB();
        System.out.println("a = " + erg1);
        System.out.println("b = " + erg2);
    }
}

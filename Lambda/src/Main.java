import java.util.Scanner;

public class Main {
    private static Number[] numbs = new Number[2];
    public static void main(String[] args)
    {
        int i = 1;
        while(i != 4)
        {
            menue_start();
            Scanner s = new Scanner(System.in);
            int input = Integer.parseInt(s.nextLine());

            switch (input)
            {
                case 1:
                    HalloJavamitForEach halloj  =  new HalloJavamitForEach();
                    halloj.halloj();
                    break;
                case 2:
                    aufgabe3();
                    break;
                case 3:
                    aufgabe4();
                    break;
                case 4:
                    i = 4;
            }
            System.out.println("\n");
        }

    }

    public static void menue_start()
    {
        System.out.println("Was wollen Sie ausprobieren?");
        System.out.println("1 - Beispiel 2");
        System.out.println("2 - Beispiel 3");
        System.out.println("3 - Beispiel 4");
        System.out.println("4 - Programm beenden");
    }

    private static void menue_calc()
    {
        System.out.println("Wählen Sie einen Rechner:");
        System.out.println("1 - Rational calculator");
        System.out.println("2 - Vector calculator");
        System.out.println("3 - Complex calculator");
        System.out.println("4 - Aus den Rechnern raus");
    }

    private static Number[] menue_kalku()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number x - a -> ");
        double xA = Double.parseDouble(s.nextLine());
        System.out.println("Enter Number x - b -> ");
        double xB = Double.parseDouble(s.nextLine());
        System.out.println("Enter Number y - a -> ");
        double yA = Double.parseDouble(s.nextLine());
        System.out.println("Enter Number y - b -> ");
        double yB = Double.parseDouble(s.nextLine());

        Number x = new Number();
        x.setA(xA);
        x.setB(xB);

        Number y = new Number();
        y.setA(yA);
        y.setB(yB);

        return new Number[]{x,y};
    }

    private static void menuezumrechnen(AbstractCalculator ac)
    {
        Number erg;

        int i = 1;
        while(i != 6)
        {
            System.out.println("Wählen Sie eine Berechnung:");
            System.out.println("1 - Addieren");
            System.out.println("2 - Subtrahieren");
            System.out.println("3 - Multiplizieren");
            System.out.println("4 - Dividieren");
            System.out.println("5 - Zahlen neu eingeben");
            System.out.println("6 - anderen Rechner verwenden");

            Scanner s = new Scanner(System.in);
            int input = Integer.parseInt(s.nextLine());

            switch (input)
            {
                case 1:
                    erg = ac.add(numbs[0], numbs[1]);
                    ac.printErg(erg);
                    break;
                case 2:
                    erg = ac.subtract(numbs[0], numbs[1]);
                    ac.printErg(erg);
                    break;
                case 3:
                    erg = ac.multiply(numbs[0], numbs[1]);
                    ac.printErg(erg);
                    break;
                case 4:
                    erg = ac.divide(numbs[0], numbs[1]);
                    ac.printErg(erg);
                    break;
                case 5:
                    numbs = menue_kalku();
                    break;
                case 6:
                    i = 6;
                    break;
            }
        }

    }

    private static void aufgabe4()
    {
        //Aufgabe 4:
        int i = 1;
        while(i != 4)
        {
            menue_calc();
            Scanner scanner = new Scanner(System.in);
            int input = Integer.parseInt(scanner.nextLine());

            switch (input)
            {
                case 1:
                    RationalCalculator rc = forRationalCalc();
                    numbs = menue_kalku();
                    menuezumrechnen(rc);
                    break;
                case 2:
                    VectorCalculator vc = forVectorCalc();
                    numbs = menue_kalku();
                    menuezumrechnen(vc);
                    break;
                case 3:
                    ComplexCalculator cc = forComplexCalc();
                    numbs = menue_kalku();
                    menuezumrechnen(cc);
                    break;
                case 4:
                    i = 4;
                    break;
                    
            }
        }
    }

    private static RationalCalculator forRationalCalc()
    {
        CalculationOperation add = (n, m) ->
        {
            Number a1 = new Number();

            double calc1 = n.getA() + m.getA();
            a1.setA(calc1);

            double calc2 = n.getB() + m.getB();
            a1.setB(calc2);

            return a1;
        };

        CalculationOperation subtract = (n, m) ->
        {
            Number numb1 = new Number();

            double calc1 = n.getA() - m.getA();
            numb1.setA(calc1);

            double calc2 = n.getB() - m.getB();
            numb1.setB(calc2);

            return numb1;
        };

        CalculationOperation multiply = (n, m) ->
        {
            Number added1 = new Number();

            double calc1 = n.getA() * m.getA();
            added1.setA(calc1);

            double calc2 = n.getB() * m.getB();
            added1.setB(calc2);

            return added1;
        };

        CalculationOperation divide = (n, m) ->
        {
            Number added1 = new Number();

            double calc1 = n.getA() / m.getA();
            added1.setA(calc1);

            double calc2 = n.getB() / m.getB();
            added1.setB(calc2);

            return added1;
        };

        return new RationalCalculator(add, subtract, multiply, divide);
    }

    private static VectorCalculator forVectorCalc()
    {
        CalculationOperation add = (n, m) ->
        {
            Number added1 = new Number();

            double calc1 = n.getA() + m.getA();
            added1.setA(calc1);

            double calc2 = n.getB() + m.getB();
            added1.setB(calc2);

            return added1;
        };

        CalculationOperation subtract = (n, m) ->
        {
            Number added1 = new Number();

            double calc1 = n.getA() - m.getA();
            added1.setA(calc1);

            double calc2 = n.getB() - m.getB();
            added1.setB(calc2);

            return added1;
        };

        CalculationOperation multiply = (n, m) ->
        {
            Number added1 = new Number();

            double calc1 = n.getB() * m.getA();
            double calc2 = n.getA() * m.getB();
            double firstResult = calc1 - calc2;
            added1.setA(firstResult);

            double calc3 = n.getA() * m.getB();
            double calc4 = n.getB() * m.getA();
            double secondResult = calc3 - calc4;
            added1.setB(secondResult);

            return added1;
        };

        CalculationOperation divide = (n, m) ->
        {
            Number added1 = new Number();

            double calc1 = n.getA() * n.getB();
            added1.setA(calc1);

            double calc2 = m.getA() * m.getB();
            added1.setB(calc2);

            return added1;
        };

        return new VectorCalculator(add, subtract, multiply, divide);
    }

    private static ComplexCalculator forComplexCalc()
    {
        CalculationOperation add = (n, m) ->
        {
            Number added1 = new Number();

            double calc1 = n.getA() + m.getA();
            added1.setA(calc1);

            double calc2 = n.getB() + m.getB();
            added1.setB(calc2);

            return added1;
        };

        CalculationOperation subtract = (n, m) ->
        {
            Number added1 = new Number();

            double calc1 = n.getA() - m.getA();
            added1.setA(calc1);

            double calc2 = n.getB() - m.getB();
            added1.setB(calc2);

            return added1;
        };

        CalculationOperation multiply = (n, m) ->
        {
            Number added1 = new Number();

            double calc1 = n.getA() * m.getA();
            added1.setA(calc1);

            double calc2 = n.getB() * m.getB();
            added1.setB(calc2);

            return added1;
        };

        CalculationOperation divide = (n, m) ->
        {
            Number added1 = new Number();

            double calc1 = n.getA() / m.getA();
            added1.setA(calc1);

            double calc2 = n.getB() / m.getB();
            added1.setB(calc2);

            return added1;
        };

        return new ComplexCalculator(add, subtract, multiply, divide);
    }

    public static void aufgabe3(){

        //AUFGABE 3
        NumberTester x = new NumberTester("LambdaText.txt");
        x.setOddEvenTester((n)->(n % 2) == 0);
        x.setPrimeTester((n)->{
            if(n == 1) return true;

            for(int i = 2; i<= n/2; i++){
                if(n % i == 0){
                    return true;
                }
            }
            return false;
        });

        x.setPalindromeTester((n)->{
            if(n > 9){
                String forw = String.valueOf(n);
                String backw = "";
                for (int i = (forw.length()-1); i >=0; i--) {
                    backw = backw + forw.charAt(i);

                }
                return forw.equals(backw);
            }
            else{
                return false;
            }
        });

        x.testFile();
    }



}

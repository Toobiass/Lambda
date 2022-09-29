import java.util.Scanner;

public class Main {
    private static Number[] numbs = new Number[2];
    public static void main(String[] args)
    {
        int i = 1;
        while(i != 4)
        {
          //  menue_start();
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
                //    aufgabe4();
                    break;
                case 4:
                    i = 4;
            }
            System.out.println("\n");
        }

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

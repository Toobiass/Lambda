public class Main {
    public static void main(String[] args) {
        NumberTester x = new NumberTester("LambdaText.txt");
        x.setOddEvenTester((n)->(n % 2) == 0);
        x.setPrimeTester((n)->{
            boolean primzahl=true;

            while(n>0){

                if(n%2==0){
                    primzahl=false;

                }
                else if(n%3==0){
                    primzahl=false;

                }

            }return primzahl;});

        //x.setPalindromeTester((n)->(n % 2) == 0); //palindrometester

        x.testFile();
    }
}

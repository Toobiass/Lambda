public class Main {
    public static void main(String[] args) {
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

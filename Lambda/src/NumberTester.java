import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberTester
{
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;


    public NumberTester ( String fileName ) {
      try{
          Scanner s = new Scanner(new File(fileName));

          String firstline = s.nextLine();

          for (int i = 0; i < Integer.parseInt(firstline); i++) {
               String tonumber= s.nextLine();

              String[] splitted = tonumber.split(" ");
              int zahl1 =Integer.parseInt(splitted[0]);int zahl2 =Integer.parseInt(splitted[1]);


          }
          while(s.hasNext()){
              System.out.println(s.nextLine());
          }
      } catch (FileNotFoundException e) {
          e.printStackTrace();
      }


    }
    public void setOddEvenTester ( NumberTest oddTester )
    {
        this.oddTester = oddTester;
    }
    public void setPrimeTester ( NumberTest primeTester ) {
        this.primeTester = primeTester ;
    }
    public void setPalindromeTester ( NumberTest palindromeTester ) {
        this.palindromeTester = palindromeTester ;
    }
    public void testFile ( ) {

        NumberTest oddTester = (n) -> (n % 2) == 0;


    }
}

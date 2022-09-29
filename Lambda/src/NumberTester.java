import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberTester
{

    private String fileName;
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;

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
        try{
            Scanner s = new Scanner(new File(fileName));

            String firstline = s.nextLine();

            for (int i = 0; i < Integer.parseInt(firstline); i++) {
                String tonumber= s.nextLine();

                String[] splitted = tonumber.split(" ");
                int zahl1 =Integer.parseInt(splitted[0]);int zahl2 =Integer.parseInt(splitted[1]);

                switch (zahl1){
                    case 1:
                        if(oddTester.testNumber(zahl2)){
                            System.out.println("EVEN");
                        }else{
                            System.out.println("ODD");
                        }
                        break;
                    case 2:
                        if(primeTester.testNumber(zahl2)){


                            System.out.println("NO PRIME");
                        }else{

                            System.out.println("PRIME");
                        }
                        break;
                    case 3:

                        if(palindromeTester.testNumber(zahl2))
                        {
                            System.out.println("PALINDROME");
                        }else{
                            System.out.println("NO PALINDROME");
                        }
                        break;
                }


            }
            while(s.hasNext()){
                System.out.println(s.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public NumberTester ( String fileName ) {

        this.fileName = fileName;

    }

}
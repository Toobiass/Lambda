import java.io.*;

public class NumberTester {
    NumberTest oddTester;
    NumberTest primeTester;
    NumberTest palindromeTester;

    public NumberTester ( String fileName ) {
        //datei
        File file = new File(fileName);

        if (!file.canRead() || !file.isFile())
            System.exit(0);

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(fileName));
            String zeile = null;
            while ((zeile = in.readLine()) != null) {
                System.out.println("Gelesene Zeile: " + zeile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null)
                try {
                    in.close();
                } catch (IOException e) {
                }
        }


    }
    public void setOddEvenTester ( NumberTest oddTester ) {
        this.oddTester = oddTester ;
    }
    public void setPrimeTester ( NumberTest primeTester ) {
        this.primeTester = primeTester ;
    }
    public void setPalindromeTester ( NumberTest palindromeTester ) {
        this.palindromeTester = palindromeTester ;
    }
    public void testFile ( ) {
// TODO
    }
}

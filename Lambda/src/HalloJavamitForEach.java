import java.util.ArrayList;
import java.util.List;

public class HalloJavamitForEach {

    public static void main(String[] args) {
     List<String> para = new ArrayList<>();
     para.add("hallo");para.add("welt");

        for (String par: para) {
            System.out.println(par);
        }

        para.forEach(s -> System.out.println(s));
        para.forEach(System.out::print);

    }

}

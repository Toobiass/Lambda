import java.util.ArrayList;
import java.util.List;

public class HalloJavamitForEach {

    public  void halloj(){
        List<String> para = new ArrayList<>();
        para.add("hallo");para.add("welt");

        for (String par: para) {
            print(par);
        }

        para.forEach(s -> print(s));

    }
    public  void print(String s){
        System.out.println(s);
    }
}

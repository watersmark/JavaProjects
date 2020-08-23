import java.util.ArrayList;


public class main {
    public static void main(String[] args) {

        ArrayList<String> first = new ArrayList<String>();

        first.add("First");
        first.add("Second");
        first.add("Third");

        for(String elem : first){
            System.out.println(elem);
        }


    }
}

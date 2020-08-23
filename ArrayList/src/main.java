import java.util.ArrayList;


public class main {
    public static void main(String[] args) {

        ArrayList<String> first = new ArrayList<String>();
        ArrayList<String> second = new ArrayList<String>();

        second.add("qq");
        second.add("2");
        second.add("d2");

        first = second;

        //ArrayList<Integer> copyOfSecondList = (ArrayList<Integer>) second.clone();

        /*
        first.add("First");
        first.add("Second");
        first.add("Third");

        for(String elem : first){
            System.out.println(elem);
        }

        System.out.println(first.get(1));
        System.out.println(first.add("44"));

        System.out.println(first);
        first.clear();
        System.out.println(first);
        */



        /*
        ArrayList<Integer> temp1 = new ArrayList<Integer>();
        temp1.add(2);
        temp1.remove(new Integer(2));
        System.out.println(temp1);
        */


        System.out.println(first.contains("qq"));
        System.out.println(first);
        first.remove("qq");
        System.out.println(first);

        System.out.println(first.indexOf("2"));

        System.out.println(first.isEmpty());

    }
}

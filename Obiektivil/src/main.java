import java.util.ArrayList;

public class main{


    public static void main(String[] args) {

        Animal cat = new Animal(32, "Kosta");
        //System.out.println(cat.age);

        Cat cat1 = new Cat(10, "Bars", 2);
        //cat1.roam(2);

        ArrayList<Animal> mass = new ArrayList<>();
        mass.add(cat);
        mass.add(cat1);

        for(Animal cats : mass){
            cats.roam(2);
            
        }


    }
}

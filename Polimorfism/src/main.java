import java.util.ArrayList;

public class main {
    public static void main(String[] args) {


        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Cat(1, "Bars"));
        animals.add(new Dog(2, "Mars", "Shpicel"));

        /*
        for(Animal zver: animals){
            System.out.println(zver.animal_age);
        }
        */

        /*
        Cat cat1 = new Cat(3, "Tolan");
        Cat cat2 = new Cat(4, "Posan");
        Cat cat3 = cat1;

        System.out.println(cat1.toString());
        System.out.println(cat1.hashCode());
        System.out.println(cat1.getClass());
        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.equals(cat3));
        */

        //// Делаем приведение типов
        /*
        Object first = new Cat(1, "sana");
        Cat second = (Cat) first;

        System.out.println(second.animal_age);
        System.out.println(second.animal_name);

        if(second instanceof Cat){
            System.out.println("Good");
        }

         */

        ArrayList<Ranneables> mass1 = new ArrayList<>();
        mass1.add(new Dog(1, "Tofa", "Dvornaga"));
        mass1.add(new Dog(2, "Opan", "Sornak"));

        for(Ranneables dogs : mass1){
             dogs.run(21);
        }
    }
}

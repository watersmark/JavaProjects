public class Animal{

    int age = 0;
    String name  = "cat";

    Animal(int age, String name ){
        this.age = age;
        this.name = name;
    }
    public void roam(int high){
        System.out.println("This is " + high);
    }
}

class Cat extends Animal{
    int moof = 1;

    Cat(int age, String name, int moof){
        super(age, name);
        this.moof = moof;
    }

    final public void roam(int high){
        System.out.println("Cat roam moof " + moof );
    }

    public void soak(String l){
        System.out.println(l);

    }
}


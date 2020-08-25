interface Ranneables{

     public void run(int speed);
}

abstract public class Animal extends Object {
    int animal_age;
    String animal_name;

    Animal(int age, String name ){
        this.animal_age = age;
        this.animal_name = name;
    }


    abstract public void eat();
    abstract public int ages();

}

class Cat extends Animal{
    Cat(int age, String name){
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("Cat eats rat");
    }

    @Override
    public int ages() {
        return this.animal_age;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

class Dog extends Animal implements  Ranneables{
    String dog_breed;
    Dog(int age, String name, String breed){
        super(age, name);
        this.dog_breed = breed;
    }

    @Override
    public void eat(){
        System.out.println("Dog eat meat");
    }

    @Override
    public int ages(){
        return this.animal_age;
    }

   final private void breds(){
       System.out.println(dog_breed);
   }

    @Override
    public void run(int speed) {
        System.out.println("Good run dog" + this.animal_name);
    }
}


public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog doggy = new Dog();
        doggy.eat();
        doggy.legs = 4;
        System.out.println(doggy.legs);
        doggy.bark();
    }
}

class Animal{
    public void eat(){
        System.out.println("Eating..");
    }

}

class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    public void bark(){
        System.out.println("Barking..");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Fish whale = new Fish();
        whale.breathe();
        whale.eat();
        whale.swim();
    }
}

class Animal{
    public void eat(){
        System.out.println("Eating..");
    }
    public void breathe(){
        System.out.println("Breathing..");
    }
}

class Fish extends Animal{
    public void swim(){
        System.out.println("Swims..");
    }
}
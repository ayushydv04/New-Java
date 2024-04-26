public class HierarchialInheritance {
    public static void main(String[] args) {
        Mammal m = new Mammal();
        m.walk();

        Fish f = new Fish();
        f.swim();

        Birds b = new Birds();
        b.fly();
    }
}

class Animal{
    public void eat(){
        System.out.println("Eating...");
    }

    public void breathe(){
        System.out.println("Breathe...");
    }
}


class Mammal extends Animal{
    public void walk(){
        System.out.println("Walking...");
    }
}

class Fish extends Animal{
    public void swim(){
        System.out.println("Swimming...");
    }
}

class Birds extends Animal{
    public void fly(){
        System.out.println("Flying...");
    }
}

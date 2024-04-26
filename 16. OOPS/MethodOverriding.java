class MethodOverriding{
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Eats everything");
    }
}


class Deer extends Animal{
    @Override
    void eat(){
        System.out.println("Eats grass only");
    }
}
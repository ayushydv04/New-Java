public class Polymorphism {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.sum(2,4));
        System.out.println(c.sum(2.5666,3.5));
        System.out.println(c.sum(1, 2, 3));
        System.out.println(c.sum(1.5,2.5));
    }
}

class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    
    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    double sum(double a, double b){
        return a+b;
    }
}


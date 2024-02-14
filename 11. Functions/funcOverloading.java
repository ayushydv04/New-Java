public class funcOverloading {
    // Function Overloading only depends on number of and type of parameters and not on return type
    public static int Sum(int a, int b){
        return a + b;
    }
    
    public static int Sum(int a, int b, int c){
        return a + b + c;
    }
    
    public static float Sum(float a, float b, float c){
        return a + b + c;
    }
    public static void main(String[] args) {
        System.out.println(Sum(5,5));
        System.out.println(Sum(10,10, 10));
        System.out.println(Sum(2.5f,2.5f,2.5f));
        
        
        
    }
}

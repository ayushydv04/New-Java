public class GetterSetter {
    public static void main(String[] args) {
        Pen p1 = new Pen();

        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

    }
}

class Pen{
    private int tip;
    private String color;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return tip;
    }

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}
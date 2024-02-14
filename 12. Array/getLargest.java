import java.util.*;
public class getLargest {


    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<number.length; i++){
            if(number[i] > largest){
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int number[] = {1, 2, 5, 9, 3, 16, 8, 10};
        int lgnum = getLargest(number);
        System.out.println(lgnum);
    }
}

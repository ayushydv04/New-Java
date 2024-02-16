public class reverseArr {

    public static void reverse(int arr[]){
        int s = 0, e = arr.length-1;
        while(s < e){

            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        reverse(arr);
        // System.out.println(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}

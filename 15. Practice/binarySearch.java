public class binarySearch {

    public static int BinarySearch(int arr[], int key) {
        int s = 0, e = arr.length - 1;
        int mid = s + (e - s) / 2;

        while (s <= e) {
            if (arr[mid] == key) {
                return 1;
            }
            if (arr[mid] < key) {
                s = mid + 1;
            }
            if (arr[mid] > key) {
                e = mid - 1;
            }
            mid = s + (e - s) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 10, 4, 89, 90, 34 };
        int key = 90;
        BinarySearch(arr, key);

        if (BinarySearch(arr, key) == 1) {
            System.out.println("Key Found");
        } else {
            System.out.println("Key not present");
        }
    }
}

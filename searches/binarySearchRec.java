import java.util.*;

public class binarySearchRec {
    public static int binRec(int arr[], int low, int high, int targ) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == targ)
            return mid;
        else if (arr[mid] < targ) {
            return binRec(arr, mid + 1, high, targ);
        } else {
            return binRec(arr, low, mid - 1, targ);
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {3,4,6,7,9,12,16,17};
        int target;
        Scanner sc = new Scanner(System.in);
        target = sc.nextInt();
        System.out.println(binRec(arr,0,arr.length - 1,target));
    }
}

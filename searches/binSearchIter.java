import java.util.*;
class binarySearch{
    public static int binSearch(int arr[], int target){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid =(high + low)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        int arr[] = {3,4,6,7,9,12,16,17};
        int target;
        Scanner sc = new Scanner(System.in);
        target = sc.nextInt();
        System.out.println(binSearch(arr, target));
    }
}

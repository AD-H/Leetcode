import java.util.*;

class linearSearch{
  public static int linearSearchFn(int arr[], int target){
    int res;
    for(int i = 0;i<arr.length;i++){
      if(arr[i] == target){
        return res;
        break;
      }
    }
    return -1;
  }

  public static void main(String [] args){
    int arr[] = {3,4,6,7,9,12,16,17};
    int target;
    Scanner sc = new Scanner(System.in);
    target = sc.nextInt();
    System.out.println(linearSearchFn(arr,target));
  }
}

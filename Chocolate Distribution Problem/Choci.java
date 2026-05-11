import java.util.*;
public class Choci {
   
    public static int findMinDiff(int arr[], int m) {
        // code here
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i+m-1<arr.length;i++)
        {
            if(arr[i+m-1]-arr[i]<min)
            {
                min=arr[i+m-1]-arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int []arr={7,8,9,3,5,6};
        System.out.println(findMinDiff(arr,4));
    }
}


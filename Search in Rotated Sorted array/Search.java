
public class Search {
    public static int bs(int []arr,int target)
    {
       int low=0,high=arr.length-1;
       while(low<=high)
       {
        int mid=low+(high-low)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        else if(arr[low]<arr[mid])
        {
            if(arr[low]<target && arr[mid]>target)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        else{
            if(target>arr[mid] && target<=arr[high])
            {
                high=mid+1;
            }
            else{
                low=mid-1;
            }
        }
       }
    
    return -1;
    }
    public static void main(String[] args) {
        int []arr={7,8,9,0,1,2,3};
        System.out.println(bs(arr,0));
    }
}

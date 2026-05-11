

public class Permutation {
   public static void next(int []arr)
   {
    int idx=-1;
    for(int i=arr.length-2;i>=0;i--)
    {
        if(arr[i]>arr[i+1])
        {
            idx=i;
            break;
        }
    }
    if(idx==-1)
    {
        reverse(arr,0,arr.length-1);
        return;
    }
    for(int i=arr.length-1;i>=idx;i--)
    {
        if(arr[i]>arr[idx])
        {
            swap(arr,i,idx);
        }
    }
    reverse(arr,idx+1,arr.length-1);
   } 
   public static void reverse(int []arr,int start,int end)
   {
    while(start<end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
    return;

   }
   public static void swap(int []arr,int start,int end)
   {
    int temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
    return;
   }
   public static void main(String[] args) {
    int []arr={1,2,3,4};
    next(arr);
   }
}

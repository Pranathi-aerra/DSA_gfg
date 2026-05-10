
public class OnePointer {
    
 public static void main(String[] args) {
        int []arr={1,3,5,6,7,8};
        reverse(arr);
    }
    public static void reverse(int []arr)
    {
        int p1=0;
        int n=arr.length;
       for(int i=0;i<(arr.length/2);i++)
        {
            int temp=arr[p1];
            arr[p1]=arr[n-i-1];
            arr[n-i-1]=temp;
            p1++;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}


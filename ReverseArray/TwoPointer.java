
public class TwoPointer {
    public static void main(String[] args) {
        int []arr={1,3,5,6,7,8};
        reverse(arr);
    }
    public static void reverse(int []arr)
    {
        int p1=0;
        int p2=arr.length-1;
        while(p1<p2)
        {
            int temp=arr[p1];
            arr[p1]=arr[p2];
            arr[p2]=temp;
            p1++;
            p2--;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

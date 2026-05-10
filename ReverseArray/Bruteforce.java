class Bruteforce
{
    public static void reverse(int []arr)
    {
        int []temp=new int[arr.length];
        int idx=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            temp[idx++]=arr[i];
        }
        for(int i=0;i<temp.length;i++)
        {
            System.out.print(temp[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []arr={1,5,7,9,0};
        reverse(arr);
    }
}
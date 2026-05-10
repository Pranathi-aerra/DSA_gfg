 import java.util.*;
 class Bruteforce
{
    public static ArrayList<Integer> minmax(int []arr)
    {
        ArrayList<Integer> res=new ArrayList<>();
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<mini){
             mini=arr[i];   
            }
            else if(arr[i]>maxi)
            {
                maxi=arr[i];
            }
        }
        res.add(mini);
        res.add(maxi);
        return res;
    }
    public static void main(String [] args)
    {
        int []arr={1,5,9,4,2};
        System.out.println(minmax(arr));

    }
}
//TC: O(N)
//SC : O(1)
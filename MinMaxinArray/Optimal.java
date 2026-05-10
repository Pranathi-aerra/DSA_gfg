
import java.util.ArrayList;

public class Optimal {
    public static ArrayList<Integer> findMin(int []arr)
    {
        ArrayList<Integer> res=new ArrayList<>();
        int n=arr.length;
        int mini,maxi,idx;
        if(n%2==1)
        {
             mini=arr[0];
             maxi=arr[0];
             idx=1;
        }
        else{
            if(arr[0]<arr[1])
            {
                mini=arr[0];
                maxi=arr[1];
            }
            else{
                mini=arr[1];
                maxi=arr[0];
            }
            idx=2;
        }
        while(idx<n-1)
        {
            if(arr[idx]<arr[idx+1])
            {
                mini=Math.min(mini,arr[idx]);
                maxi=Math.max(maxi,arr[idx+1]);
            }
            else{
                 mini=Math.min(mini,arr[idx+1]);
                maxi=Math.max(maxi,arr[idx]);
            }
            idx+=2;
        }
        res.add(mini);
        res.add(maxi);
        return res;

    }
    public static void main(String[] args) {
        int []arr={1,7,4,6,9};
        System.out.println(findMin(arr));
    }
}
//TC:O(N)
//SC:O(1)

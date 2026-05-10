import java.util.ArrayList;

public class UsingBS {
    public static ArrayList<Integer> minmax(int []arr)
    {
        return findlowhigh(arr,0,arr.length-1);
    }
    public static ArrayList<Integer> findlowhigh(int []arr,int low, int high)
    {
         ArrayList<Integer> res=new ArrayList<>();
         if(low==high)
         {
            res.add(arr[low]);
            res.add(arr[high]);
            return res;
         }
         if(low+1==high)
         {
            if(arr[low]<arr[high])
            {
                res.add(arr[low]);
                res.add(arr[high]);
            }
            else{
                res.add(arr[high]);
                res.add(arr[low]);
            }
            return res;
         }
         int mid=(low+high)/2;
         ArrayList<Integer> lft=findlowhigh(arr, low, mid);
         ArrayList<Integer> rgt=findlowhigh(arr, mid+1, high);
         int min=Math.min(lft.get(0),rgt.get(0));
         int max=Math.max(lft.get(1),rgt.get(1));
         res.add(min);
         res.add(max);
         return res;
    }
    public static void main(String [] args)
    {
        int []arr={1,5,9,4,2};
        System.out.println(minmax(arr));

    }
    
}
//TC:O(N)
//SC:O(logN)
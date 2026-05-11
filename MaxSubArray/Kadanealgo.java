public class Kadanealgo {
    public static int maximum(int []arr)
    {
        int cursum=arr[0];
        int maxsum=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            cursum=Math.max(arr[i],cursum+arr[i]);
            maxsum=Math.max(maxsum, cursum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int []arr={5,4,-1,7,8};
        System.out.println(maximum(arr));
    }
}

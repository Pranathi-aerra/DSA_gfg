import java.util.*;
public class Dupli {
  public static boolean contains(int []arr)
  {
    HashSet<Integer> hs=new HashSet<>();
    for(int i:arr)
    {
        hs.add(i);
    }
    return hs.size()!=arr.length;
  }
  public static void main(String[] args) {
    int []arr={1,2,4,5,2};
    System.out.println(contains(arr));
  }
}

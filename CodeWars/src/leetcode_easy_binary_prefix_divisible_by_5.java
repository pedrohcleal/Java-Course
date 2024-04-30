import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class leetcode_easy_binary_prefix_divisible_by_5 {
    public static void main(String[] args) {
       System.out.println(prefixesDivBy5(new int[] {0,1,1}));
       System.out.println(prefixesDivBy5(new int[] {1,0,1,1,1,1,0,0,0,0,1,0,0,0,0,0,1,0,0,1,1,1,1,1,0,0,0,0,1,1,1,0,0,0,0,0,1,0,0,0,1,0,0,1,1,1,1,1,1,0,1,1,0,1,0,0,0,0,0,0,1,0,1,1,1,0,0,1,0}));

    }

    public static List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>();
        StringBuilder numstr = new StringBuilder();

        for(int num: nums){
            //System.out.println(num);
            numstr.append(num);
            //System.out.println(numstr);
            BigInteger number = new BigInteger(numstr.toString(), 2);
            BigInteger zero = BigInteger.valueOf(0);
//            if ((number % zero) == 0){
//                result.add(true);
//            }
//            else {
//                result.add(false);
//            }
        }

        return  result;
    }
}

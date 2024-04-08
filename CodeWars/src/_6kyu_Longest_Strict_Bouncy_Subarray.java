import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _6kyu_Longest_Strict_Bouncy_Subarray {
    public static void main(String[] args) {
        List<Integer> numbs = Arrays.asList(7,9,6,10,5,11,10,12,13,4,2,5,1,6,4,8);

        System.out.println(longestBouncyList(numbs));
        System.out.println("resultado esperado = [7,9,6,10,5,11,10,12]");

    }
    static List<Integer> longestBouncyList(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        

        for (int i = 0; i < arr.size(); i++) {

        }
        return result;
    }
}
// arr = [7,9,6,10,5,11,10,12,13,4,2,5,1,6,4,8,3,5,67,1,7,8]



//       [7,9,6,10,5,11,10,12]

//       [0,1,2,3,4,5,6]
//        0,1   3,4,5,6
//       [1,5,2,7,4,1,4]

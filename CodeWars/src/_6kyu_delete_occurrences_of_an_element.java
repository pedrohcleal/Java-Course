import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _6kyu_delete_occurrences_of_an_element {
    public static void main(String[] args) {
        int[] result = deleteNth( new int[] { 20, 37, 20, 21 }, 1);
        System.out.println(Arrays.toString(result));
    }
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        List<Integer> result = new ArrayList<>();
        for (int num: elements){
            int cont = (int) result.stream()
                    .filter(numb -> numb == num)
                    .count();
            if (cont < maxOccurrences){
                result.add(num);
            }
        }
        return result.stream(). mapToInt(Integer::intValue).toArray();
    }

}

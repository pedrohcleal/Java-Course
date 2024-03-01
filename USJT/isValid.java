import java.util.ArrayList;
import java.util.Arrays;

public class isValid {
    public static int findMissing(int[] numbers) {
        int param1 = numbers[1] - numbers[0];
        int param2 = numbers[2] - numbers[1];

        int sub1 = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sub1 -= numbers[i];
            System.out.println("i= " + i + "numbers[i] =" +numbers[i]);
        }
        

        return 0;
    }
    public static void main(String[] args){
        System.out.println(findMissing(new int[]{ 1, 3, 4})
                + "  resultado deve ser: -> '2'");
    }
}

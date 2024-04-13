import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _Directions_Reduct {
    public static void main(String[] args) {
        String[] test1 = {"NORTH", "EAST", "SOUTH", "EAST"};

        dirReduc(test1);
        System.out.println("[\"NORTH\", \"WEST\", \"SOUTH\", \"EAST\"]");

    }

    public static String[] dirReduc(String[] arr) {
        List<String> strs = new ArrayList<>(Arrays.asList(arr));

        for (int i = 0; i < strs.size()-1;){
            System.out.println(strs.get(i));
            if (strs.get(i).equals("NORTH") && strs.equals(i+1)) {
                strs.remove("NORTH");
                strs.remove("SOUTH");
                //System.out.println("");
            }
            else if (strs.get(i).equals("SOUTH") && strs.contains("NORTH")) {
                strs.remove("NORTH");
                strs.remove("SOUTH");
            }
            else if(strs.get(i).equals("EAST") && strs.contains("WEST")) {
                strs.remove("EAST");
                strs.remove("WEST");
            }
            else if(strs.get(i).equals("WEST") && strs.contains("EAST")) {
                strs.remove("EAST");
                strs.remove("WEST");
            } else {
                i++;
            }

            System.out.println(i);
            System.out.println(strs);
        }
        System.out.println("final" + strs);
        return strs.toArray(new String[0]);
    }
}

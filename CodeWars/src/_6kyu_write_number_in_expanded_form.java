public class _6kyu_write_number_in_expanded_form {
    public static void main(String[] args) {
        System.out.println(expandedForm(12));
        System.out.println(expandedForm(70304));
    }
    public static String expandedForm(int num)
    {
        int zeros = String.valueOf(num).length();
        StringBuilder result = new StringBuilder();
        StringBuilder numstr = new StringBuilder(String.valueOf(num));
        StringBuilder current = new StringBuilder();

        while (num > 0) {
            current.append(numstr.charAt(0));
            current.append("0".repeat(zeros - 1));
            num -= Integer.parseInt(current.toString());
            result.append(current);
            if (num > 0){
                result.append(" + ");
            }
            current.setLength(0);
            numstr = new StringBuilder(String.valueOf(num));
            zeros = String.valueOf(num).length();
        }
        return result.toString();
    }
}

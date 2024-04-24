public class _5kyu_whats_perfect_power_anyway {
    public static void main(String[] args) {
        int[] test1 = isPerfectPower(81);

        for (int num: test1){
            System.out.println(num);
        }
        System.out.println("(3,4) or (9,2)" );
    }

    public static int[] isPerfectPower(int n) {
        System.out.println(n);
        if (n < 2){
            return null;
        }

        int[] result = new int[2];
        for (int m = 2; m <= Math.sqrt(n); m++){
            for(int k = 2; k <= 100; k++ ){
                int pow = (int) Math.pow(m,k);
                if (pow == n) {
                    result[0] = m;
                    result[1] = k;
                    return  result;
                }
                else if (pow > n){
                    break;
                }
            }
        }
        return null;
    }

//    public class PerfectPower {
//        public static int[] isPerfectPower(int n) {
//            if (n < 2) {
//                return null;
//            }
//
//            for (int base = 2; base <= Math.sqrt(n); base++) {
//                int exponent = 2;
//                int power = base * base;
//
//                while (power <= n && power > 0) {
//                    if (power == n) {
//                        return new int[]{base, exponent};
//                    }
//
//                    exponent++;
//                    power *= base;
//                }
//            }
//
//            return null;
//        }
//    }


}

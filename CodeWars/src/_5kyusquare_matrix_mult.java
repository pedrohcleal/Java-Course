public class _5kyusquare_matrix_mult {
    public static void main(String[] args) {
        int[][] a = {
                { 1, 2 },
                { 3, 2 }};
        int[][] b = {
                { 3, 2 },
                { 1, 1 }};
        System.out.println(matrixMultiplication(a,b));
    }

    private static int[][] matrixMultiplication(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b.length];

        int sum1 = 0;
        int sum2 = 0;

        System.out.println(b[0][0]);
        System.out.println(a[0][0]);

        System.out.println(b[1][0]);
        System.out.println(a[0][1]);

        System.out.println("start\n");
        for (int j = 0; j < a.length; j++) {
            for (int k = 0; k < a.length; k++){
                System.out.println("a= " + a[j][k]);
                System.out.println("b= " + b[k][j]);
                sum1 += a[j][k] *b[k][j];
            }
            result[0][0] = sum1;
            System.out.println(sum1);
            sum1 = 0;
            break;
        }
      return null;
    }
}

//C[0][0] = A[0][0] * B[0][0] + A[0][1] * B[1][0] = 1*3 + 2*1 =  5
//C[0][1] = A[0][0] * B[0][1] + A[0][1] * B[1][1] = 1*2 + 2*1 =  4
//C[1][0] = A[1][0] * B[0][0] + A[1][1] * B[1][0] = 3*3 + 2*1 = 11
//C[1][1] = A[1][0] * B[0][1] + A[1][1] * B[1][1] = 3*2 + 2*1 =  8

//  A         B         C
//|1 2|  x  |3 2|  =  | 5 4|
//|3 2|     |1 1|     |11 8|

//|2 1|
//|3 1|
//+++++
//|1 2|
//|3 2|
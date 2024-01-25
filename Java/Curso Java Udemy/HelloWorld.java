class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] numeros = {1,2,2,3,3,3,4,3,3,3,2,2,1};
        System.out.println(findIt(numeros));
        //findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5});
    }
    public static int findIt(int[] A) {
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            
            System.out.println("xor: " + xor);
            System.out.println("elemento em A: " + A[i]);
            xor ^= A[i];

            System.out.println("xor: " + xor);
            System.out.println(" ---------");

        }
        return xor;
    }
}
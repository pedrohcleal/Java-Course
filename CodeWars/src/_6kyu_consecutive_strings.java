class _6kyu_consecutive_strings {
    public static String longestConsec(String[] strarr, int k) {
        StringBuilder atual = new StringBuilder();
        StringBuilder maior = new StringBuilder();

        if (k < 1) {
            return "";
        }

        for (int i = 0; i < strarr.length-k+1; i++){
            atual.append(strarr[i]);
            if (!(k == 1)){
                for (int i2 = i+1; i2 < i + k; i2++ ) {
                    atual.append(strarr[i2]);
                }
            }
            if (atual.length() > maior.length()) {
                maior = new StringBuilder(atual);
            }
            atual = new StringBuilder("");
        }

        return "" + maior;
    }
}
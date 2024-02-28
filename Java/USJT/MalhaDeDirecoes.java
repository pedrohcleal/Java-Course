public class MalhaDeDirecoes {
    public static void main(String[] args) {
        // Tamanho da matriz
        int linhas = 5;
        int colunas = 5;

        // Criando a matriz
        boolean[][] malha = new boolean[linhas][colunas];

        // Definindo a posição da pessoa (linha 2, coluna 3)
        int posicaoLinha = 2;
        int posicaoColuna = 3;

        // Marcando a presença da pessoa na matriz
        malha[posicaoLinha][posicaoColuna] = true;

        // Exibindo a matriz
        exibirMatriz(malha);
    }

    // Método para exibir a matriz
    public static void exibirMatriz(boolean[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] ? "1 " : "0 ");
            }
            System.out.println();
        }
    }
}

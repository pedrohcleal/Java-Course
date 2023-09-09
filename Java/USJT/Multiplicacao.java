import javax.swing.JOptionPane;

public class Multiplicacao {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual o seu nome?");
        double primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        double segundoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        double resultadoMultiplicacao = primeiroValor * segundoValor;
        double resultadoDivisao = primeiroValor / segundoValor;
        //JOptionPane.showMessageDialog(null, nome + " a multiplicação é " + resultado);
        // A partir das barras, o texto é ignorado até o fim da linha
        JOptionPane.showMessageDialog(null, "Olá " + nome + "\nA multiplicação é: " 
                + resultadoMultiplicacao + "\nA divisão é: " + resultadoDivisao);
    }
}
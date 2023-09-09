import javax.swing.JOptionPane;

public class HelloWorld {
    public static void main(String[] args) {
        double primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        double segundoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        JOptionPane.showMessageDialog(null, "A soma é " + (primeiroValor + segundoValor));
    }
}
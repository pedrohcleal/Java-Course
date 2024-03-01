package entities;

public class Functionary {
    public String Name;
    public double GrossSalary;
    public double Tax;
    public double NetSalary(){
    return GrossSalary - Tax;}
    public double IncreaeSalary(double pctg) {
        return GrossSalary + GrossSalary * pctg / 100.0;
    }
    public String toString() {
        return "Salário - Imposto= " + String.format("%.2f", NetSalary())
                + "\nNome= " + String.format(Name);
    }
}

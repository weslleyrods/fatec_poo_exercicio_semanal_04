import javax.swing.JOptionPane;

//1) Escreva um programa que obtém o salário de uma pessoa e diz se ela está ganhando
//pelo menos o salário mínimo.

public class ExercicioSelecaoSalario {

    public static void main(String[]args){
        
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu salário R$"));

        if (salario >= 1100)
            JOptionPane.showMessageDialog(null, "O valor do seu salário é pelo menos um salário mínimo");
        else 
            JOptionPane.showMessageDialog(null, "Você ganha menos que um salario minimo");
    }

}
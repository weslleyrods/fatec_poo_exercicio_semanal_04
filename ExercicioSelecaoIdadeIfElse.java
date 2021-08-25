

/*2. Escreva um programa que obtém a idade de uma pessoa e diz se ela é maior,
segundo a legislação brasileira. Escreva uma versão com if/else e outra com o
operador ternário.*/

import javax.swing.JOptionPane;

public class ExercicioSelecaoIdadeIfElse {
    public static void main(String[] args) {
        

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informa a sua idade"));
        if (idade >= 18)
            JOptionPane.showMessageDialog(null, "Voce e de maior");
        else
            JOptionPane.showMessageDialog(null, "Voce e de menor");
    }
}

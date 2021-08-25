/*2. Escreva um programa que obtém a idade de uma pessoa e diz se ela é maior,
segundo a legislação brasileira. Escreva uma versão com if/else e outra com o
operador ternário.*/

import javax.swing.JOptionPane;

public class ExercicioSelecaoIdadeTernario {
    public static void main(String[] args) {
        

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade"));
        String podeDirigir = idade >= 18 ? "Voce pode dirigir" : "Voce nao pode dirigir" ;
        //Boolean podeDirigir = idade >= 18 ? true : false ;
        JOptionPane.showMessageDialog(null,podeDirigir);
    }
}
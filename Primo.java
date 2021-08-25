import javax.swing.JOptionPane;

public class Primo {
    
    public static void main(String[] args) {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero inteiro"));
        int cont = 2;
        while (n % cont !=0 && cont <= n/2){
            cont++;       }

        if (n <=1)
        JOptionPane.showMessageDialog(null,"Não é primo");
        else if (n % cont != 0 || n == 2)
        JOptionPane.showMessageDialog(null,"É primo");
        else
        JOptionPane.showMessageDialog(null,"Não é primo");
    }
}

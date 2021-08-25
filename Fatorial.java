import javax.swing.JOptionPane;

public class Fatorial {
    public static void main(String[] args) {
        
        //n! = n . (n – 1)    
        int numEscolhido = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero inteiro"));
        int i, f = 1;
        for(i = 1; i <= numEscolhido; i++){          
            f = f * i;
        }
        JOptionPane.showMessageDialog(null,"O fatorial de "+numEscolhido+" é "+f);
    }
}

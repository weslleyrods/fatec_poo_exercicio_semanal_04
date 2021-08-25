public class RepeticaoNumNatDoWhile {
    public static void main(String[] args) {
        
        int i = 0;
        System.out.println ("\n");
        System.out.println("Os 100 primeiros numeros naturais são:\n");
        do {
            System.out.printf("%d ", i);
            i++;
        }while (i<100);

        //Ordem Reversa
        int n = 99;
        System.out.println ("\n");
        System.out.println("Os 100 primeiros numeros naturais em ordem REVERSA são:\n");
        do {
            System.out.printf("%d ", n);
            n--;
        }while (n>=0);
        

    }
}

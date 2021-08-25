public class RepeticaoNumNatWhile {
    public static void main(String[] args) {
        
        int i = 0;
        System.out.println("\n");
        System.out.println("Os 100 primeiros numeros naturais são:\n");
        while (i<100){
            System.out.printf("%d ", i);
            i++;
        }
        
        int n = 99;
        System.out.println("\n");
        System.out.println("Os 100 primeiros numeros naturais em ordem REVERSA são:\n");
        while (n>=0){
            System.out.printf("%d ", n);
            n--;
        }
    }
}

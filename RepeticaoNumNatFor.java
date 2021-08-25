public class RepeticaoNumNatFor {
    public static void main(String[] args) {
        
        int i;//contador

        System.out.println ("\n");
        System.out.println("Os 100 primeiros numeros naturais são:\n");
        for(i = 0; i<100; i++ ){   
            System.out.printf("%d ", i);
        }

        //Ordem Reversa
        System.out.println ("\n");
        System.out.println("Os 100 primeiros numeros naturais em ordem REVERSA são:\n");
        for(i = 99; i >= 0; i-- ){   
            System.out.printf("%d ", i);
        }


    }
}

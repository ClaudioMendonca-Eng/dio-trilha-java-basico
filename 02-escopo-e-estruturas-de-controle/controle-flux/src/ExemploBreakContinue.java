public class ExemploBreakContinue {

    public static void main(String[] args) {
        /** Exemplo de uso do break
        for (int numero = 1; numero <=5; numero++) {
            if (numero == 3) {
                break;
            }
            System.out.println("O número é " + numero);
        }
        */

        // Exemplo de uso do continue
        for (int numero = 1; numero <=5; numero++) {
            if (numero == 3) {
                continue;
            }
            System.out.println("O número é " + numero);
        }
        
    }
    
}

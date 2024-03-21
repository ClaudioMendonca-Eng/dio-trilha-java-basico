public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 30.0;

        /** Modo Condicional simples
      
        if(valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;
        
        System.out.println(saldo);
        */

        // Modo Condicional composta
        if(valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
    
}

public class ResultadoEscolar {
    public static void main(String[] args) {

       int nota = 6;
       
       /** Modo Condicional composta
       if(nota >= 7)
        System.out.println("Aprovado");

       else
        System.out.println("Reprovado");
        */

        /** Condicional encadeada
        if(nota >= 7)
            System.out.println("Aprovado");
        else if(nota >= 5 && nota < 7  )
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");
        */

        /** Condição ternária simples
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
        */

        // Condição ternária composta
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
               
    }
}
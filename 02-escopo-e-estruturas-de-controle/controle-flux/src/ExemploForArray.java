public class ExemploForArray {

    public static void main(String[] args) {
        /** Exemplo for array simples
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no idica x= " + x + " é " + alunos[x]);
        }
        */

        // Exemplo for array com foreach
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (String aluno : alunos) {
            System.out.println("O aluno é " + aluno);
        }
    }
    
}

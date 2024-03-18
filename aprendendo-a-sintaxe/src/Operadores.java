public class Operadores {

    public static void main(String[] args) {

        //classe Operadores.java
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);
                
        //qual o resultado das expressoes abaixo?
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

        
        // Operadores aritméticos
        int a = 10;
        int b = 20;
        int c = a + b; // Soma
        int d = a - b; // Subtração
        int e = a * b; // Multiplicação
        int f = b / a; // Divisão
        int g = b % a; // Módulo
        System.out.println("Soma: " + c);
        System.out.println("Subtração: " + d);
        System.out.println("Multiplicação: " + e);
        System.out.println("Divisão: " + f);
        System.out.println("Módulo: " + g);
        
        // Operadores de incremento e decremento
        int h = 10;
        h++; // Incremento
        System.out.println("Incremento: " + h);
        h--; // Decremento
        System.out.println("Decremento: " + h);
        
        // Operadores de comparação
        int i = 10;
        int j = 20;
        System.out.println("i == j: " + (i == j)); // Igual
        System.out.println("i != j: " + (i != j)); // Diferente
        System.out.println("i > j: " + (i > j)); // Maior
        System.out.println("i < j: " + (i < j)); // Menor
        System.out.println("i >= j: " + (i >= j)); // Maior ou igual
        System.out.println("i <= j: " + (i <= j)); // Menor ou igual
        
        // Operadores lógicos
        boolean k = true;
        boolean l = false;
        System.out.println("k && l: " + (k && l)); // E
        System.out.println("k || l: " + (k || l)); // OU
        System.out.println("!k: " + !k); // NÃO

        //Operado Unário
        int numero = 5;
        System.out.println("numero: " + (- numero));        
        System.out.println("numero: " + numero);
        System.out.println("-----------");
        numero = - numero;
        System.out.println("numero: " + numero);
        
        numero = + numero;
        System.out.println("numero: " + numero * -1);
        System.out.println("-----------");

        //int m = 10;
        // int n = -m; // Negação
        // System.out.println("Negação: " + n);

        

        //Operações incrementais
        int q = 10;
        q += 5; // q = q + 5
        System.out.println("Incremento: " + q);
        q -= 5; // q = q - 5
        System.out.println("Decremento: " + q);
        q *= 5; // q = q * 5
        System.out.println("Multiplicação: " + q);

        // x repetição
        int numeroTeste = 5;
        //numeroTeste++; // numeroTeste = numeroTeste + 1

        System.out.println(numeroTeste ++);
        System.out.println(numeroTeste);
        System.out.println(++ numeroTeste);
        System.out.println(numeroTeste);

        System.out.println(numeroTeste --);
        System.out.println(numeroTeste);
        System.out.println(-- numeroTeste);
        System.out.println(numeroTeste);

        //Operador booleano

        boolean variavel01 = true;

        System.out.println(!variavel01);

        System.out.println(variavel01);

        boolean variavel02 = true;

        variavel02 = !variavel02;

        System.out.println(variavel02);

        //boolean r = true;
        //boolean s = false;

        //System.out.println("r && s: " + (r && s)); // E
        //System.out.println("r || s: " + (r || s)); // OU
        //System.out.println("!r: " + !r); // NÃO

        //Operador de comparação
        //int t = 10;
        //int u = 20;
        //System.out.println("t == u: " + (t == u)); // Igual
        //System.out.println("t != u: " + (t != u)); // Diferente
        //System.out.println("t > u: " + (t > u)); // Maior
        //System.out.println("t < u: " + (t < u)); // Menor
        //System.out.println("t >= u: " + (t >= u)); // Maior ou igual
        //System.out.println("t <= u:
        //" + (t <= u)); // Menor ou igual


        //Operador Ternário <Expressão Condicional>`` ?``<Caso condição seja true>``: ``<Caso condição seja false>

        // classe Operadores.java
        int aa, bb;

        aa = 5;
        bb = 5;

        String resultado = (aa==bb) ? "verdadeiro" : "falso";
        System.out.println(resultado);

        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso";
        */

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        //String resultado = (aa==bb) ? "verdadeiro" : "false";

        //System.out.println(valor);


        //int o = 10;
        //int p = (o == 10) ? 20 : 30; // Condição
        //System.out.println("Condição: " + p);


        //Operador de Relacionais

        int numero03 = 1;
        int numero04 = 2;

        if(numero03 < numero04){
            System.out.println("A nossa condiçao é verdadeira");
        }

        boolean simNao = numero03 == numero04;

        System.out.println("numero 03 é igual a numero 04? " + simNao);

        simNao = numero03 != numero04;

        System.out.println("numero 03 é diferente a numero 04? " + simNao);

        simNao = numero03 > numero04;

        System.out.println("numero 03 é maior que numero 04? " + simNao);


        String nome001 = "Claudio";
        String nome002 = "Claudio";

        System.out.println(nome001 == nome002);

        String nome003 = "Claudio";
        String nome004 = new String("Claudio");

        System.out.println(nome003 == nome004);

        // para comparar o conteudo de duas variaveis do tipo String, utilizamos o metodo equals
        
        System.out.println(nome003.equals(nome004));




        //int v = 10;
        //int w = 20;
        //System.out.println("v == w: " + (v == w)); // Igual
        //System.out.println("v != w: " + (v != w)); // Diferente
        //System.out.println("v > w: " + (v > w)); // Maior
        //System.out.println("v < w
        //: " + (v < w)); // Menor
        //System.out.println("v >= w: " + (v >= w)); // Maior ou igual
        //System.out.println("v <= w
        //: " + (v <= w)); // Menor ou igual

        //Operador de logico

        boolean condicao001 = true;
        boolean condicao002 = false;

        if(condicao001 && condicao002){
            System.out.println("A nossa condiçao é verdadeira");
        }

        System.out.println("fim do programa");

        if(condicao001 || condicao002){
            System.out.println("Uma das condições é verdadeira");
        }   

        //boolean x = true;
        //boolean y = false;
        //System.out.println("x && y: " + (x && y)); // E
        //System.out.println("x || y: " + (x || y)); // OU
        //System.out.println("!x: " + !x); // NÃO












    }
    
}

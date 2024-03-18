public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Tipos primitivos
        byte b = 127; // 8 bits
        short s = 32767; // 16 bits
        int i = 2147483647; // 32 bits
        long l = 9223372036854775807L; // 64 bits
        float f = 3.4028235E38f; // 32 bits
        double d = 1.7976931348623157E308; // 64 bits
        char c = 'A'; // 16 bits
        boolean bool = true; // 1 bit

        // Tipos não primitivos
        String str = "Hello, World!"; // 16 bits

        // Exibindo os valores
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
        System.out.println("String: " + str);

        // Exibindo os tamanhos
        System.out.println("byte: " + Byte.SIZE + " bits");
        System.out.println("short: " + Short.SIZE + " bits");
        System.out.println("int: " + Integer.SIZE + " bits");
        System.out.println("long: " + Long.SIZE + " bits");
        System.out.println("float: " + Float.SIZE + " bits");

        // Exibindo os valores mínimos e máximos
        System.out.println("byte: " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " a " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " a " + Long.MAX_VALUE);
        System.out.println("float: " + Float.MIN_VALUE + " a " + Float.MAX_VALUE);
        System.out.println("double: " + Double.MIN_VALUE + " a " + Double.MAX_VALUE);

        // Exibindo o valor de um char
        System.out.println("char: " + (int) c);

        // Exibindo o valor de um boolean
        System.out.println("boolean: " + bool);

        // Exibindo o valor de um String
        System.out.println("String: " + str);

        // Exibindo o tamanho de um String
        System.out.println("String: " + str.length());

        // Exibindo o valor de um String
        System.out.println("String: " + str);

        // Estudem a classe String que representa texto na aplicação
        
        String meuNome = "Claudio Mendonça";
        System.out.println(meuNome);

        double salarioMinimo = 2500;
        System.out.println(salarioMinimo);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        System.out.println(numeroCurto2);

        int numero = 5;
        numero = 10;
        System.out.println(numero);

        // final double VALOR_DE_PI = 3.14;


        

    }
}

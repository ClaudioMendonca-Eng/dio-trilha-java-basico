/**
 * <h1>ContaTerminal</h1>
 * A classe ContaTerminal é responsável por gerenciar o cadastro de clientes bancários através do terminal.
 * <p>
 * <b>Nota:</b> Este programa permite ao usuário cadastrar clientes bancários fornecendo informações como agência, número da conta, nome do cliente e saldo.
 * 
 * @author  Claudio Mendonça
 * @version 1.0
 * @since   20/03/2024
 */
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================\n" + //
                        "░▒█▀▀▄░█▀▀▄░█▀▀▄░█▀▄░▄▀▀▄░░░░░░▒█░█▀▀▄░▄░░░▄░█▀▀▄\n" + //
                        "░▒█▀▀▄░█▄▄█░█░▒█░█░░░█░░█░░░░░░▒█░█▄▄█░░█▄█░░█▄▄█\n" + //
                        "░▒█▄▄█░▀░░▀░▀░░▀░▀▀▀░░▀▀░░░░▒█▄▄█░▀░░▀░░░▀░░░▀░░▀\n" + //
                        "==================================================");
                
        //TODO: Exibir mensagem para o nosso usuário
        System.out.println("||| Seja bem vindo! |||\n" + //
                            "==================================================\n" + //
                        ":: CADASTRO DO CLIENTE \n Preencha os campos abaixo para criar sua conta bancária.\n");

        // TODO: Obter pelo scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        String numero = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        // TODO: Exibir o mensagem da conta criada
        System.out.println("==================================================\n" + //
                            "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco:\n" + //
                            "==================================================\n" + //                            
                            "AGÊNCIA: " + agencia + " \n" + //
                            "CONTA: " + numero + " \n" + // 
                            "SALDO EM CONTA: " + saldo + " *Já está disponível para saque.\n" + //
                            "==================================================");

    }
}

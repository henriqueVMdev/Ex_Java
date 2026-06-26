import java.util.Scanner;

public class EX1 {
/* EX 1 codigo onte temos uma conta bancaria que possa realizar as seguintes operacoes
* consultar saldo, consultar cheque especial, depositar dinheiro, sacar dinheiro, pagar um boleto, verificar se a conta esta usando cheque especial
*
* regras a conta bancaria deve ter um limite de cheque somado ao saldo da conta,
* o valor do cheque especial e definido na criacao da conta de acordo com o valor depositado no momento da criacao
* se o valor depositado da conta for de 500 ou menos cheque especial deve ser de 50, para valores acima de 500 o cheque deve ser 50% do valor
* caso o limite de cheque especial seja usado assim que possivel a conta deve cobrar uma taxa de 20% do valor do cheque especial*/

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name;
    double primeiroDeposito;

        System.out.println("Bem vindo ao banco SkyBank, por favor digite seu nome: ");
            name = sc.nextLine();

        System.out.println("Seja muito bem vindo senhor " + name + " sera um prazer lhe atender");

        System.out.println("Insira a quantia de seu primeiro deposito: ");
        primeiroDeposito = sc.nextDouble();
        sc.nextLine();

        System.out.println("Deposito: " + primeiroDeposito + " confirma este valor? tecle Sim para confirmar e Nao para tentar denovo");
        String escolha = sc.nextLine();

            while (! escolha.equals( "Sim")){
                System.out.println("Insira a quantia de seu primeiro deposito: ");
                primeiroDeposito = sc.nextDouble();
                sc.nextLine();
                System.out.println("Deposito: " + primeiroDeposito + " confirma este valor? tecle Sim para confirmar e Nao para tentar denovo");
                escolha = sc.nextLine();
            }

        Conta conta = new Conta( name, primeiroDeposito);

        System.out.println("conta criada com sucesso!! bem vindo ao nosso banco "+ name);

        System.out.println(conta);
        System.out.print("Precione [1] para sacar \nPrecione [2] para depositar \nPrecione [3] para consultar cheque especial \nPrecione [4] para pagar boleto \n");
        int escolhaAcao = sc.nextInt();

        if (escolhaAcao == 1){
                System.out.println("Insira a quantidade que deseja sacar");
                double saque = sc.nextDouble();
                conta.sacar(saque);
        }
        else if ( escolhaAcao == 2){
            System.out.println("Insira a quantidade que deseja depositar");
            double deposito = sc.nextDouble();
            conta.depositar(deposito);
        }

        else if ( escolhaAcao == 3){
            if (conta.usandoCheque()){
                System.out.println("Saldo negativo, conta usando cheue especial");
            }
            else{
                System.out.println("Nao esta usando cheque especial, saldo positivo tudo ok,");
            }
        }

        else if ( escolhaAcao == 4){
            System.out.println("Insira o valor do boleto");
            double valorBoleto = sc.nextDouble();
            conta.pagarBoleto(valorBoleto);
        }
    }
}
public class Conta{

    public Conta(String donoConta, double saldo) {
        this.saldo = saldo;
        this.donoConta = donoConta;
        if (saldo <= 500){
        this.chequeEspecial = 50;
        }
        else {
            this.chequeEspecial = saldo * 0.5;
        }

    }

    private String donoConta;
    private double saldo;
    private double chequeEspecial;

    public double getSaldo(){
        return saldo;
    }

    public double getCheque(){
        return chequeEspecial;
    }

    public boolean usandoCheque() {
        return saldo < 0;
    }

    public void depositar(double deposito){
        saldo = saldo + deposito;
        System.out.print("valor depositado com sucesso.\nNovo saldo: " + getSaldo()+"\n");
    }

    public void sacar(double saque){

       if (saque <= saldo + chequeEspecial) {
           if (saldo >= 0 && saldo - saque < 0) {
               saldo = saldo - saque - (0.20 * chequeEspecial);
               System.out.print("saque realizado com sucesso ultilizando cheque especial taxa de 20% cobrada.\nNovo saldo: " + getSaldo() +"\n");
           }
           else {
               saldo = (saldo - saque);
               System.out.print("saque realizado com sucesso.\nNovo saldo: "+ getSaldo()+ "\n");
;           }
       }
       else {
           System.out.println("Saldo insuficiente, digite novamente");
       }
    }

    public void pagarBoleto(double valorBoleto){

        if (valorBoleto <= saldo + chequeEspecial) {
            if (saldo >= 0 && saldo - valorBoleto < 0) {
                saldo = saldo - valorBoleto - (0.20 * chequeEspecial);
                System.out.print("Boleto pago com sucesso usando chequeEspecial, taxa de 20% em cima do cheque cobrada\nNovo saldo: "+ getSaldo() + "\n");
            }
            else {
                saldo = (saldo - valorBoleto);
                System.out.println("Boleto pago com sucesso.\nNovo saldo: " + getSaldo() + "\n");
            }
        }
        else {
            System.out.println("Saldo insuficiente, digite novamente");
        }
    }

    public String getDono(){
        return donoConta;
    }
    @Override
    public String toString(){
        return  "Nome " + donoConta + " Saldo: " + saldo + " Cheque especial: " + chequeEspecial;

    }

}

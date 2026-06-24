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

    public String getDono(){
        return donoConta;
    }
    @Override
    public String toString(){
        return  "Nome " + donoConta + " Saldo: " + saldo + " Cheque especial: " + chequeEspecial;
    }

}

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public  String titular;


    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setNomeTitular(String titular) {
        this.titular = titular;
    }

    public void exibeConta(){
        System.out.println("Número da conta: "+this.numeroConta);
        System.out.println("Saldo da conta: "+this.saldo);
        System.out.println("Titular da conta: "+this.titular);
    }

    
}

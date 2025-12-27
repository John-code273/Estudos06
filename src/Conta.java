public class Conta {
    public String nome;
    private final int id;
    private double saldo;

    public Conta(int id,String nome, double depositoInicial) {
        deposito(depositoInicial);
        this.id = id;
        this.nome = nome;
    }

    public Conta( int id, String nome) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double saldo) {this.saldo += saldo;}
    public void saque(double saldo) {this.saldo = (this.saldo - saldo)-5;}

    @Override
    public String toString() {
        return "id: " + getId() + ", nome: " + getNome() + ", saldo: " + getSaldo();
    }
}

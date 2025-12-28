void main() {
    Scanner scanner = new Scanner(System.in);
    Conta conta;
    System.out.println("  ===== Conta do Banco =======");
    System.out.println("  ");
    System.out.print("Entre com o número da conta: ");
    int id = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Entre com o nome da sua conta: ");
    String nome = scanner.nextLine();

    System.out.print("Deseja incrementar uma quantia inicial? (s/n)");
    String s = scanner.next();
    if (s.equals("s")){
        System.out.print("Entre com a quantia inicial: ");
        double saldo = scanner.nextDouble();
        conta = new Conta(id,nome,saldo);
    }
    else {
        conta = new Conta(id, nome);
    }
    System.out.println("Sua conta foi criada com sucesso! ");
    System.out.println("Informações da conta:");
    System.out.println(conta);

    System.out.print("Entre com um deposito: ");
    double deposito = scanner.nextDouble();
    conta.deposito(deposito);
    System.out.println("Informações da conta:");
    System.out.println(conta);

    System.out.print("Entre com um saque: ");
    double saque = scanner.nextDouble();
    conta.saque(saque);
    System.out.println("Informações da conta:");
    System.out.println(conta);
}

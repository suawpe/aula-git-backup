void main() {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    int pedido = random.nextInt(20000);

    IO.println("Olá, bem vindo ao Restaurante do Seu Zé!");
    IO.println("");

    IO.println("Qual o seu nome?");
    String nome = sc.nextLine();

    IO.println("Qual o nome do prato escolhido?");
    String nomeprato = sc.nextLine();

    IO.println("Qual o valor do prato? (Pequeno = 15,00 / Médio = 25,00 / Grande = 30,00)");
    double valor = sc.nextDouble();

    //

    IO.println("Seu pedido: " + pedido);
    IO.println("Nome: " + nome);
    IO.println("Resumo do pedido: " + nomeprato);
    IO.println("Valor Total: " + valor );
}
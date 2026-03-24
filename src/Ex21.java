void main() {
    Scanner sc = new Scanner(System.in);

    IO.println("Bem vindo ao CaDePro!");
    IO.print("Qual o valor da sua compra?: R$ ");
    double valorOriginal = sc.nextDouble();

    double porcentagemDesconto;

    if (valorOriginal < 50) {
        porcentagemDesconto = 0.0;
    } else if (valorOriginal <= 200) {
        porcentagemDesconto = 10.0;
    } else {
        porcentagemDesconto = 20.0;
    }

    double valorDesconto = (valorOriginal * porcentagemDesconto) / 100;
    double valorFinal = valorOriginal - valorDesconto;

    IO.println("");
    IO.println("Desconto aplicado: " + porcentagemDesconto + "%");
    IO.println(String.format("Valor do desconto: R$ %.2f", valorDesconto));
    IO.println(String.format("Total a pagar: R$ %.2f", valorFinal));
}
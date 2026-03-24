void main() {
    Scanner sc = new Scanner(System.in);

    IO.println("Bem vindo ao CalSsão!");
    IO.println("");
    IO.print("Digite o valor total das vendas: R$ ");
    double valorVendas = sc.nextDouble();

    double percentual;

    if (valorVendas < 1000) {
        percentual = 3.0;
    } else if (valorVendas <= 5000) {
        percentual = 7.0;
    } else {
        percentual = 12.0;
    }

    double valorComissao = (valorVendas * percentual) / 100;

    IO.println("");
    IO.println("Sua porcentagem de comissão: " + percentual + "%");
    IO.println(String.format("Valor da comissão a receber: R$ %.2f", valorComissao));
}
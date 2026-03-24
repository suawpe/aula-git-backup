void main() {
    Scanner sc = new Scanner(System.in);

    IO.println("Bem vindo ao Sistema de Cashback!");
    IO.println("");
    IO.println("Digite o valor total da compra: ");
    double valorCompra = sc.nextDouble();

    double percentual;

    if (valorCompra <= 100) {
        percentual = 2.0;
    }
    else if (valorCompra <= 500) {
        percentual = 5.0;
    }
    else {
        percentual = 10.0;
    }

    double valorCashback = (valorCompra * percentual) / 100;

    IO.println("Percentual aplicado: " + percentual + "%");
    IO.println(String.format("Você receberá R$ %.2f de volta!", valorCashback));
}
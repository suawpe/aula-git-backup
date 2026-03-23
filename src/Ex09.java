void main() {
    int fretegratis = 100;
    Scanner sc = new Scanner(System.in);

    IO.println("Olá! Bem vindo ao programa de frete grátis oferecido pela NoturnoExpress");
    IO.println("");
    IO.println("Qual o valor da sua compra?");
    double valorcompra = sc.nextDouble();

    double adicaoprod = fretegratis - valorcompra;

    if (valorcompra >= fretegratis) {
        IO.println("Você tem direito ao frete grátis por ter gastado mais de R$ 100,00!");
    } else {
        IO.println("Você não tem direito ao frete grátis!");
        IO.println("Você pode adicionar o valor de R$: " + adicaoprod + " para cobrir o valor e conseguir o frete grátis!");
    }
}
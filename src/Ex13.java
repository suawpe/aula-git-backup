void main() {
    Scanner sc = new Scanner(System.in);

    IO.println("Qual o total de GB do seu plano?");
    double limiteTotal = sc.nextDouble();

    IO.println("Quanto você já usou?");
    double usado = sc.nextDouble();

    double percentualUso = (usado * 100.0) / limiteTotal;

    if (percentualUso < 80) {
        IO.println("Uso dentro do limite");
    }
    else if (percentualUso <= 100) {
        IO.println("Atenção: você está próximo do limite");
    }
    else {
        IO.println("Limite excedido");
    }
}
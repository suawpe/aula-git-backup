void main() {
    Scanner sc = new Scanner(System.in);

    IO.println("Olá! Você definiu uma meta diária de faturamento de R$ 5.000");
    IO.println("");
    IO.println("Qual foi o faturamento do dia?");

    double faturamentodiario = sc.nextDouble();
    double contagem = faturamentodiario - 5000;
    if (faturamentodiario == 5000) {
        IO.println("Você atingiu a sua meta!");

    } else if (faturamentodiario > 5000) {
        IO.println("Você excedeu seu faturamento! Parabéns!");
        IO.println("Quanto excedeu: R$:" + contagem);

    }else {
        IO.println("Você não atingiu sua meta!");
        IO.println("Quanto faltou: R$:" + contagem);
    }
}
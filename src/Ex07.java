void main() {

    int notaminima = 7;
    Scanner sc = new Scanner(System.in);
    IO.println("Bem vindo ao sistema de aprovação!");
    IO.println("");
    IO.println("Qual foi sua nota neste bimestre?");

    double nota = sc.nextDouble();

    if (nota >= notaminima) {
        IO.println("Parabéns! Você foi aprovado!");
    } else {
        IO.println("Infelizmente você acabou sendo reprovado por sua nota final ser abaixo da mínima");
    }

}
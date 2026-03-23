void main() {


    double totalArquivo = 2.0;
    Scanner sc = new Scanner(System.in);

    IO.println("Quanto do arquivo de 2GB já foi baixado (em GB)?");
    double baixado = sc.nextDouble();

    double percentual = (baixado / totalArquivo) * 100;

    String resultado = String.format("%.1f", percentual);

    IO.println("Download " + resultado + "% concluído.");
}
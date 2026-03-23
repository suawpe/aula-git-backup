void main() {
    Scanner sc = new Scanner(System.in);
    IO.println("Olá! Quantas paginas do seu livro você leu hoje?");
    int paginaslidas = sc.nextInt();

    double percentual = (paginaslidas / 300.0) * 100;

    String valorFormatado = String.format("%.2f", percentual);
    IO.println("Você leu " + valorFormatado + "% do seu livro!");
}
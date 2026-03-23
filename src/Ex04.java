void main() {
    Scanner sc = new Scanner(System.in);
    int meta = 10000;
    IO.println("Você estabeleceu uma meta! Quantos passos você deu hoje?");
    int qpassos = sc.nextInt();

    int quantosFaltam = meta - qpassos;
    int passosexcedidos = qpassos - 10000;

    if (qpassos >= meta) {
        IO.println("Voce atingiu sua meta!");
        IO.println("Quantos passos excederam: " + passosexcedidos);

    } else if (qpassos <= meta ) {
        IO.println("Voce nao atingiu sua meta!");
        IO.println("Quantos passos faltaram: " + quantosFaltam);

    }
}
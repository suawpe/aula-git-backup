void main() {
    Scanner sc = new Scanner(System.in);

    IO.println("Olá! Bem vindo ao QuaCa! Você definiu um limite diarío de 2.000 calorias");
    IO.println("");
    IO.println("Quantas calorias foram consumidas hoje?");
    double totalcal = sc.nextDouble();

    double ultrapassagem = totalcal - 2000;

    if (totalcal <= 2000) {
        IO.println("Boa! Você está dentro dos limites!");
    } else {
        IO.println("Você ultrapassou seu limite!");
        IO.println("Calorias ultrapassadas: " + ultrapassagem + " Cal.");
    }
}
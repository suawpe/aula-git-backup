void main() {
    Scanner sc = new Scanner(System.in);

    IO.println("Olá! Você definiu um limite de 4 horas por dia no celular!");
    IO.println("");
    IO.println("Por quantas horas você usou o celular hoje?");
    int uso = sc.nextInt();

    double limiteultrapassado = uso - 4;

    if (uso <= 4) {
        IO.println("Boa! Você ainda continua dentro dos limites!");
    } else {
        IO.println("Você ultrapassou seu limite!");
        IO.println("Limite ultrapassado: " + limiteultrapassado + " Horas");
    }
}
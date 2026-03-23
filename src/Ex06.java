void main() {

    int meta = 40;
    Scanner sc = new Scanner(System.in);

    IO.println("Olá! Você definiu uma meta de estudos. Por quanto tempo você estudou esse mês?");
    IO.println("");

    int estudoreal = sc.nextInt();

    if (estudoreal >= meta) {
        IO.println("Parabéns! Você atingiu a sua meta!");
        IO.println("Realizado: " + estudoreal + " Horas");
        IO.println("Planejado: " + meta + " Horas");
    } else {
        IO.println("Você infelizmente não atingiu a sua meta!");
        IO.println("Realizado: " + estudoreal + " Horas");
        IO.println("Planejado: " + meta + " Horas");
    }
}
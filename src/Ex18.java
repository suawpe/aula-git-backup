void main() {
    Scanner sc = new Scanner(System.in);

    IO.println("Olá! Bem vindo ao Stembo!");
    IO.println("");
    IO.println("Qual a sua pontuação atual? (Ex: 55");
    int points = sc.nextInt();

    if (points > 100) {
        IO.println("Sua classificação é PRO!");
    } else if (points >= 50) {
        IO.println("Sua classificação é MÉDIO!");
    } else {
        IO.println("Sua classificação é INICIANTE!");
    }
}
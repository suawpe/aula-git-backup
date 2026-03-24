void main() {
    Scanner sc = new Scanner(System.in);

    IO.println("Olá! Bem vindo ao Slepi!");
    IO.println("");
    IO.println("Quantas horas você dormiu nesta noite?");
    int sono = sc.nextInt();

    if (sono > 8) {
        IO.println("Seu sono está em um estado excelente!");
    } else if (sono >= 5) {
        IO.println("Seu sono está em um estado ok!");
    } else {
        IO.println("Seu sono está em um estado péssimo!");
    }
}
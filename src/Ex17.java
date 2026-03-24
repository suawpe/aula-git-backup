void main() {
    Scanner sc = new Scanner(System.in);

    IO.println("Bem vindo ao LifeBat");
    IO.println("");
    IO.println("Qual o percentual atual da bateria? (Ex: 78");
    int saude = sc.nextInt();

    if (saude >= 80) {
        IO.println("Sua bateria está com a saúde no nível alto!");
    } else if (saude >= 20) {
        IO.println("Sua bateria está com a saúde no nível normal!");
    } else {
        IO.println("Sua bateria está com a saúde no nível CRÍTICO!");
    }
}
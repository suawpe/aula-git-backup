void main() {
    Scanner sc = new Scanner(System.in);
    double meta = 500.00;
    IO.println("Olá! Você criou um objetivo de guardar R$: 500,00 em um mês");
    IO.println("");
    IO.println("Quanto voce conseguiu guardar?");
    double cofre = sc.nextDouble();

    double quantofalta = meta - cofre;

    if(cofre >= meta ) {
        IO.println("Você atingiu ou passou a sua meta do mês! Parabéns!");
    }else {
        IO.println("Poxa... Você não atingiu a sua meta do mês");
        IO.println("Quanto faltou: " + quantofalta);
    }
}
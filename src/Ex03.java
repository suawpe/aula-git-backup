void main() {
    Scanner sc = new Scanner(System.in);
    IO.println("Bem vindo ao KronikHub!");
    IO.println("");

    IO.println("Qual seu nickname como jogador?");
    String nickname = sc.nextLine();

    IO.println("Qual seu jogo favorito?");
    String favgame = sc.nextLine();

    IO.println("Qual sua pontuação atual?");
    double pontuacao = sc.nextDouble();

    IO.println("");
    IO.println("Seu Perfil");
    IO.println("");

    IO.println("User: " + nickname);
    IO.println("Jogo Favorito: " + favgame);
    IO.println("Pontuação Atual: " + pontuacao);

}
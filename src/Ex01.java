void main() {
    Scanner sc = new Scanner(System.in);

    IO.println("Olá, Aluno! Preencha alguns dados para realizar o cadastro.");
    IO.println("\n");

    IO.println("1. Qual o seu nome? (Completo) ");
    String nome = sc.nextLine();

    IO.println("2. Qual curso voce está matriculado? (Desenvolvimento de Sistemas ou Estrutura de Redes");
    String curso = sc.nextLine();

    IO.println("3. Qual a sua idade?");
    int idade = sc.nextInt();

    IO.println("Cadastro Concluido!");
    IO.println("\n");
    IO.println("Suas informacoes");
    IO.println("Nome: " + nome);
    IO.println("Seu curso: " + curso);
    IO.println("Idade: " + idade);

//    IO.println("Cadastro Concluido! \n\n Suas informacoes \n\n Nome: " + nome + "\n Seu curso: " + curso + "\n Idade: " + idade);
}
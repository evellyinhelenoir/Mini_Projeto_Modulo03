package br.com.zup;

import java.util.Scanner;

public class Sistema {

    private static Scanner capturarDados(String menssagem) {
        System.out.println(menssagem);
        return new Scanner(System.in);
    }

    //Menus
    private static void menu() {
        System.out.println("\nBem vinde à nossa auto escola\n" +
                "Digite 1 para gerênciar os funcionários.\n" +
                "Digite 2 para gerênciar os alunos.\n" +
                "Digite 3 para gerênciar a frota de veículos.\n" +
                "Digite 4 para sair!.");
    }

    private static void menuAluno() {
        System.out.println("\nSelecione qual função você deseja realizar: " +
                "\n1 - Para cadastrar um novo aluno." +
                "\n2 - Para remover um aluno." +
                "\n3 - Para exibir a lista de alunos cadastrados" +
                "\n4 - Para voltar ao menu inicial.");
    }

    private static void menuFuncionario() {
        System.out.println("\nSelecione qual função você deseja realizar: " +
                "\n1 - Para cadastrar um novo funcionário." +
                "\n2 - Para remover um funcionário." +
                "\n3 - Para exibir a lista de funcionários cadastrados." +
                "\n4 - Para voltar ao menu inicial.");
    }


    //Métodos Funcionario
    public static Funcionario cadastrarFuncionario() {

        String nome = capturarDados("Digite o nome do funcionário: ").nextLine();
        String cpf = capturarDados("Digite o cpf do funcionário: ").nextLine();
        int idade = capturarDados("Digite a idade do funcionário: ").nextInt();
        String telefone = capturarDados("Digite o telefone do funcionário: ").nextLine();
        String endereco = capturarDados("Digite o endereço do funcionário: ").nextLine();
        String funcao = capturarDados("Digite a funcção do funcionário: ").nextLine();

        Funcionario funcionario = new Funcionario(nome, cpf, idade, telefone, endereco, funcao);
        return funcionario;
    }


    //Métodos Alunos
    public static Aluno cadastrarAluno() {
        String nome = capturarDados("Digite o nome do Aluno: ").nextLine();
        String cpf = capturarDados("Digite o CPF do Aluno: ").nextLine();
        int idade = capturarDados("Digite a idade do Aluno: ").nextInt();
        String telefone = capturarDados("Digite o telefone do Aluno: ").nextLine();
        String endereco = capturarDados("Digite o endereço do Aluno: ").nextLine();
        String categoria = capturarDados("Digite a categoria desejada do Aluno: ").nextLine();

        Aluno aluno = new Aluno(nome, cpf, idade, telefone, endereco, categoria);

        return aluno;

    }


    //Métodos Veiculos


    //Execução
    public static void executar() {

        AutoEscola autoEscola = new AutoEscola("Pé No Freio", "Esquina da 25 Março", "40028922");

        boolean loop = true;
        boolean loopFuncionario = true;
        boolean loopAluno = true;
        boolean loopFrota = true;

        while (loop) {

            menu();
            int opcao = capturarDados("Digite a opção desejada:").nextInt();

            if (opcao == 1) {
                while (loopFuncionario) {

                    menuFuncionario();
                    opcao = capturarDados("Digite a opção desejada: ").nextInt();

                    if (opcao == 1) {
                        Funcionario funcionario = cadastrarFuncionario();
                        autoEscola.adicionarFuncionario(funcionario);

                    } else if (opcao == 2) {


                    } else if (opcao == 3) {
                        autoEscola.exibirListaFuncionario();

                    } else if (opcao == 4) {
                        loopFuncionario = false;

                    } else {
                        System.out.println("Opção selecionada inválida, digite novamente!");
                    }

                }

            } else if (opcao == 2) {

                while (loopAluno) {
                    menuAluno();
                    opcao = capturarDados("Digite a opção desejada: ").nextInt();

                    if (opcao == 1) {
                        Aluno aluno = cadastrarAluno();
                        autoEscola.adicionarAlunos(aluno);

                    } else if (opcao == 2) {


                    } else if (opcao == 3) {
                        autoEscola.exibirListaAlunos();

                    } else if (opcao == 4) {
                        loopAluno = false;

                    } else {
                        System.out.println("Opção selecionada inválida, digite novamente!");
                    }

                }

            } else if (opcao == 3) {
                while (loopFrota) {

                    opcao = capturarDados("Digite a opção desejada: ").nextInt();

                    if (opcao == 1) {


                    } else if (opcao == 2) {


                    } else if (opcao == 3) {


                    } else if (opcao == 4) {
                        loopFrota = false;

                    } else {
                        System.out.println("Opção selecionada inválida, digite novamente!");
                    }

                }

            }else if (opcao == 4){
                loop = false;
                System.out.println("Até a proxima!");
            }
            else {
                System.out.println("Opção selecionada inválida, digite novamente!");
            }
        }
    }
}
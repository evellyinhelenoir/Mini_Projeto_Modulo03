package br.com.zup;

import java.util.List;
import java.util.Scanner;

public class Sistema {

    private static Scanner capturarDados (String menssagem) {
        System.out.println(menssagem);
        return new Scanner(System.in);
    }

    private static void menu(){
        System.out.println("Bem vinde à nossa auto escola\n" +
                "Digite 1 para gerênciar os funcionários.\n" +
                "Digite 2 para gerênciar os alunos.\n" +
                "Digite 3 para gerênciar a frota de veículos.");
    }

    private static void menuAluno(){
        System.out.println("O que você deseja fazer?\n" +
                "1- Cadastrar novo aluno\n" +
                "2- Excluir aluno\n" +
                "3- Exibir lista de alunos cadastrados\n");
    }

    public static Aluno cadastrarAluno(){
        String nome = capturarDados("Digite o nome do Aluno: ").nextLine();
        String cpf = capturarDados("Digite o CPF do Aluno: ").nextLine();
        int idade = capturarDados("Digite a idade do Aluno: ").nextInt();
        String telefone = capturarDados("Digite o telefone do Aluno: ").nextLine();
        String endereco = capturarDados("Digite o endereço do Aluno: ").nextLine();
        String categoria = capturarDados("Digite a categoria desejada do Aluno: ").nextLine();

        Aluno aluno = new Aluno(nome,cpf,idade,telefone,endereco,categoria);

        return aluno;

    }

    public static Funcionario cadastrarFuncionario(){

        String nome = capturarDados("Digite o nome do funcionário: ").nextLine();
        String cpf = capturarDados("Digite o cpf do funcionário: ").nextLine();
        int idade = capturarDados("Digite a idade do funcionário: ").nextInt();
        String telefone = capturarDados("Digite o telefone do funcionário: ").nextLine();
        String endereco = capturarDados("Digite o endereço do funcionário: ").nextLine();
        String funcao = capturarDados("Digite a funcção do funcionário: ").nextLine();

        Funcionario funcionario = new Funcionario(nome, cpf, idade, telefone, endereco, funcao);
        return funcionario;
    }

    public static void executar() {

        AutoEscola autoEscola = new AutoEscola("Pé No Freio", "Esquina da 25 Março", "40028922");
        boolean loop = true;

        while (loop) {
            menu();
            int opcao = capturarDados("Digite a opção desejada: \n").nextInt();
            if (opcao == 1){
                System.out.println("Selecione qual função você deseja realizar: \n" +
                        "1 - Para cadastrar um novo funcionário.\n" +
                        "2 - Para remover um funcionário.\n" +
                        "3 - Para exibir a lista de funcionários.\n" +
                        "4 - Para voltar ao menu inicial.\n");

            }else if(opcao == 2){

                menuAluno();
                opcao = capturarDados("Digite a opção desejada: \n").nextInt();
                if (opcao == 1){
                   Aluno aluno =  cadastrarAluno();
                    autoEscola.adicionarAlunos(aluno);
                }else if (opcao == 2){

                }else if (opcao == 3){
                    autoEscola.exibirListaAlunos();
                }else{

                }

            }else if(opcao == 3){


            }else {
                System.out.println("Opção selecionada inválida, digite novamente!");
            }
        }
    }
}
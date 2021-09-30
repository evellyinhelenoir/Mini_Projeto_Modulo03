package br.com.zup;

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


    public static Aluno cadastrarAluno(){
        String nome = capturarDados("Digite o nome do Aluno: \n").nextLine();
        String cpf = capturarDados("Digite o CPF do Aluno: \n").nextLine();
        int idade = capturarDados("Digite a idade do Aluno: \n").nextInt();
        String telefone = capturarDados("Digite o telefone do Aluno: \n").nextLine();
        String endereco = capturarDados("Digite o endereço do Aluno: \n").nextLine();
        String categoria = capturarDados("Digite a categoria desejada do Aluno: \n").nextLine();

        Aluno aluno = new Aluno(nome,cpf,idade,telefone,endereco,categoria);

        return aluno;

    }


    public static void executar() {

        AutoEscola autoEscola = new AutoEscola("Pé No Freio", "Esquina da 25 Março", "40028922");
        boolean loop = true;


        while (loop) {
            menu();
            int opcao = capturarDados("Digite a opção desejada: \n").nextInt();

            if (opcao == 1){

            }else if(opcao == 2){

            }else if(opcao == 3){

            }
        }
    }
}
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
    public static void executar() {

        AutoEscola autoEscola = new AutoEscola("Pé No Freio", "Esquina da 25 Março", "40028922");
        boolean loop = true;
        Scanner scan = new Scanner(System.in);

        while (loop) {

            int opcao = scan.nextInt();
            if (opcao == 1){

            }else if(opcao == 2){

            }else if(opcao == 3){

            }
        }
    }
}
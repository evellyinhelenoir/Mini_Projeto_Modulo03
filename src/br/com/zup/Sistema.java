package br.com.zup;

import java.util.Scanner;

public class Sistema {
    private static void menu(){
        System.out.println("Bem vinde à nossa auto escola\n" +
                "Digite 1 para gerênciar os funcionários.\n" +
                "Digite 2 para gerênciar os alunos.\n" +
                "Digite 3 para gerênciar a frota de veículos.\n");
    }
    private static Scanner capturarDados (String menssagem) {
        System.out.println(menssagem);
        return new Scanner(System.in);

    }

}
package br.com.njaco.Tarefa_Colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TarefaColecoes {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite nomes separados por vírgula: ");
        String nomes = sc.nextLine();
        List<String> listaNomes = new ArrayList<>(List.of(nomes.split(",")));

        Collections.sort(listaNomes);
        System.out.println(">NOMES EM ORDEM ALFABÉTICA<");
        System.out.println(listaNomes);

        sc.close();

    }
}

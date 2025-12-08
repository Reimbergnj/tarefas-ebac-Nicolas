package br.com.njaco.Tarefa_Colecoes;

import java.util.Scanner;

public class TarefaColecoes2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome e o gênero da pesssoa separados por um traço/hífen e, para cada nova pessoa, separar com vírgula: ");
        String nomeSexos = sc.nextLine();

        String[] todosNomesComSexo = nomeSexos.split(",");
        for (String resultado : todosNomesComSexo) {
            String nome = resultado.trim();
            String nomeSemSexo = nome.substring(0, nome.length() - 2);
            if (nome.endsWith("-f") || nome.endsWith("-F")) {
                System.out.println("Nome: " + nomeSemSexo + ", Sexo: Feminino");
            } else if (nome.endsWith("-m") || nome.endsWith("-M")) {
                System.out.println("Nome: " + nomeSemSexo + ", Sexo: Masculino");
            } else {
                System.out.println("Nome: " + nome + ", Sexo: Indefinido ");
            }
        }
        sc.close();
    }
}

package br.com.njaco.TarefaAprovacao;

public class MediaAprovacao {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 2;
        int num3 = 7;
        int num4 = 8;
        int num5 = num1 + num2 + num3 + num4;
        int num6 = num5 / 4;
        System.out.println("A nota da 1º prova é: " + num1);
        System.out.println("A nota da 2º prova é: " + num2);
        System.out.println("A nota da 3º prova é: " + num3);
        System.out.println("A nota da 4º prova é: " + num4);
        System.out.println("A média das notas é: " + num6);
        if (num6 >= 7) {
            System.out.println("Parabéns, aprovado!");
        } else if (num6 >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

    }
}
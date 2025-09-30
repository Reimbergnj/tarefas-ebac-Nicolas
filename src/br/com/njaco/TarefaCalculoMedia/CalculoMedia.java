package br.com.njaco.TarefaCalculoMedia;

public class CalculoMedia {
    public static void main (String[] args){
        int num1 = 10;
        int num2 = 40;
        int num3 = 50;
        int num4 = 20;
        int num5 = num1 + num2 + num3 + num4;
        int num6 = num5 / 4;
        System.out.println("A nota de Pedro é: " + num1);
        System.out.println("A nota de Isabel é: " + num2);
        System.out.println("A nota de Mateus é: " + num3);
        System.out.println("A nota de Beatriz é: " + num4);
        System.out.println("A média das notas é: " + num6);
    }
}

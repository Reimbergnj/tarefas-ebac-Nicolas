package br.com.njaco.MeuPrimeiroObjeto;

public class CarroTeste{
    public static void main(String [] args){
        Carro c1 = new Carro();
        c1.nome = "Uno";
        c1.marca = "Fiat";
        c1.ano = 2015;
        c1.velocidade = 30;

        c1.acelerar(10);
        System.out.println("Velocidade: " +c1.velocidade + "Km/h");
        c1.buzinar();
    }
}
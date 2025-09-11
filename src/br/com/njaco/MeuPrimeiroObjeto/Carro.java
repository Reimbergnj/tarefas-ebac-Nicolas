package br.com.njaco.MeuPrimeiroObjeto;
/**
 * @author njaco
 */
public class Carro{

    
    //Atributos

    String nome;
    String marca;
    int ano;
    int velocidade;

    //Métodos
    void acelerar(int aceleracao){
        velocidade+=aceleracao;

    }
    void freiar (int reduzir){
        velocidade-=reduzir;
    }
    void buzinar(){
        System.out.println("bibi!");
    }
}





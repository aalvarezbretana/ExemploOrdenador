/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploordenador;

import java.util.Scanner;

/**
 *
 * @author aalvarezbretana
 */
public class ExemploOrdenador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Tipo do rato?");
        String tipo = teclado.nextLine();
        System.out.println("Marca pantalla?");
        String marca = teclado.nextLine();
        System.out.println("Pulgadas pantalla?");
        float pulgadas = teclado.nextFloat();
        System.out.println("Velocidade cpu?(en Mhz)");
        int velocidade = teclado.nextInt();
        System.out.println("Memoria cpu(en GB)");
        int memoria = teclado.nextInt();
        Rato rato = new Rato(tipo);
        Pantalla pantalla = new Pantalla(marca, pulgadas);
        CPU cpu = new CPU(velocidade, memoria);
        Ordenador ordenador = new Ordenador(rato, pantalla, cpu);
        ordenador.amosar();

    }

}

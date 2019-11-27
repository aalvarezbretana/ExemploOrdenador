/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploordenador;

import java.util.Scanner;

/**
 *Main class ExampleComputer
 * 
 * @author aalvarezbretana
 */
public class ExampleComputer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Tipo do rato?");
        String type = sc.nextLine();
        System.out.println("Marca pantalla?");
        String brand = sc.nextLine();
        System.out.println("Pulgadas pantalla?");
        float inches = sc.nextFloat();
        System.out.println("Velocidade cpu?(en Mhz)");
        int speed = sc.nextInt();
        System.out.println("Memoria cpu(en GB)");
        int memory = sc.nextInt();
        Mouse mouse = new Mouse(type);
        Screen screen = new Screen(brand, inches);
        Cpu cpu = new Cpu(speed, memory);
        Computer computer = new Computer(mouse, screen, cpu);
        computer.see();

    }

}

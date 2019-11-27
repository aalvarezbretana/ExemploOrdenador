/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploordenador;

/**
 *
 * @author aalvarezbretana
 */
public class Cpu {

    private int speed;
    private int memory;

    /**
     *constructor with parameters of the class cpu 
     * @param speed
     * @param memory
     */
    public Cpu(int speed, int memory) {
        this.speed = speed;
        this.memory = memory;
    }

    /**
     *constructor without parameters of the class cpu
     */
    public Cpu() {

    }

    /**
     *get the values of speed
     * @return
     */
    public int getSpeed() {
        return speed;
    }

    /**
     *set value of speed
     * @param speed
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     *get the values of memory
     * @return
     */
    public int getMemory() {
        return memory;
    }

    /**
     *set value of memory
     * @param memory
     */
    public void setMemory(int memory) {
        this.memory = memory;
    }

}

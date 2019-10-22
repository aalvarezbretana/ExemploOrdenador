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
public class CPU {

    private int velocidade;
    private int memoria;

    public CPU(int velocidade, int memoria) {
        this.velocidade = velocidade;
        this.memoria = memoria;
    }

    public CPU() {

    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

}

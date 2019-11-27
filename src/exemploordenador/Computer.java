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
public class Computer {

    private Mouse mouse = new Mouse();
    private Screen screen = new Screen();
    private Cpu cpu = new Cpu();

    /**
     *constructor withou parameters of the class computer
     */
    public Computer() {
    }

    /**
     *constructor with parameters of the class computer
     * @param mouse
     * @param screen
     * @param cpu
     */
    public Computer(Mouse mouse, Screen screen, Cpu cpu) {
        this.mouse = mouse;
        this.screen = screen;
        this.cpu = cpu;
    }

    /**
     *get the values of mouse
     * @return
     */
    public Mouse getMouse() {
        return mouse;
    }

    /**
     *set the value to mouse
     * @param mouse
     */
    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    /**
     *get the value of screen
     * @return
     */
    public Screen getScreen() {
        return screen;
    }

    /**
     *set values to screen
     * @param screen
     */
    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    /**
     *get the values of cpu
     * @return
     */
    public Cpu getCpu() {
        return cpu;
    }

    /**
     *sets values to cpu
     * @param cpu
     */
    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    /**
     *this method shows everything
     */
    public void see() {
        System.out.println("O tipo do rato é " + mouse.getType() + "."
                + "\nA marca da pantalla é " + screen.getBrand() + "."
                + "\nAs pulgadas da pantalla son " + screen.getInches()
                + "."
                + "\nA velocidade da cpu é " + cpu.getSpeed() + " Mhz."
                + "\nA memoria da cpu é " + cpu.getMemory() + " GB.");

    }

}

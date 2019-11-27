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
public class Screen {

    private String brand;
    private float inches;

    /**
     *constructor with parameters of the class screen
     * @param brand
     * @param inches
     */
    public Screen(String brand, float inches) {
        this.brand = brand;
        this.inches = inches;
    }

    /**
     *constructor without parameters of the class screen
     */
    public Screen() {

    }

    /**
     *get the values of brand
     * @return
     */
    public String getBrand() {
        return brand;
    }

    /**
     *set the value to brand
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     *get the values of inches
     * @return
     */
    public float getInches() {
        return inches;
    }

    /**
     *set value to inches
     * @param inches
     */
    public void setInches(float inches) {
        this.inches = inches;
    }
}

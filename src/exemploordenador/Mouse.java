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
public class Mouse {

    private String type;

    /**
     *constructor with parameters of the class mouse
     * @param type
     */
    public Mouse(String type) {
        this.type = type;
    }

    /**
     *constructor without parameters of the class mouse
     */
    public Mouse() {

    }

    /**
     *get the values of type
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     *sets value to type
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

}

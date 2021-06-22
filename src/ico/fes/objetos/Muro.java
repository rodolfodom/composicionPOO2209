/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.objetos;

import java.awt.Color;

/**
 *
 * @author rodolfodom
 */
public class Muro {
    private float largo;
    private float alto;
    private float ancho;
    private Color color;
    private Ventana[] ventanas;
    private Puerta puerta;

    public Muro() {
    }

    public Muro(float largo, float alto, float ancho, Color color, Ventana[] ventanas, Puerta puerta) {
        this.largo = largo;
        this.alto = alto;
        this.ancho = ancho;
        this.color = color;
        this.ventanas = ventanas;
        this.puerta = puerta;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Ventana[] getVentanas() {
        return ventanas;
    }

    public void setVentanas(Ventana[] ventanas) {
        this.ventanas = ventanas;
    }
    
    
    
}

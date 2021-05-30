/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_3;

/**
 *
 * @author OppositeDragon
 */
public class CMonstruo implements IPersonaje {

    private String nombre;
    private String img;
    private double peso;
    private double altura;
    private double inteligencia;
    private double habilidades;

    public CMonstruo() {
    }

    public CMonstruo(String nombre, String img, double peso, double altura, double inteligencia, double habilidades) {
        this.nombre = nombre;
        this.img = img;
        this.peso = peso;
        this.altura = altura;
        this.inteligencia = inteligencia;
        this.habilidades = habilidades;
    }

    @Override
    public Object clonar() {
        CHeroe heroe = new CHeroe(nombre, img, peso, altura, inteligencia, habilidades);
        return heroe;
    }
}

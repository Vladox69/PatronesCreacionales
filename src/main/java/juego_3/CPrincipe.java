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
public class CPrincipe implements IPersonaje {

    private String nombre;
    private String img;
    private double peso;
    private double altura;
    private double inteligencia;
    private String habilidades;

    public CPrincipe() {
    }

    public CPrincipe(String nombre, String img, double peso, double altura, double inteligencia, String habilidades) {
        this.nombre = "Principe \""+nombre+"\"";
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

    @Override
    public String toString() {
        return "CPrincipe{ nombre= " + nombre + ", img= " + img + ", peso= " + peso + ", altura= " + altura + ", inteligencia= " + inteligencia + ", habilidades= " + habilidades + " }";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = "Principe \""+nombre+"\"";
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(double inteligencia) {
        this.inteligencia = inteligencia;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }
    
}

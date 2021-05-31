/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_3;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author OppositeDragon
 */
public class CCatalogoPersonajePrototipo {

    ArrayList[] vector = new ArrayList[4];
    ArrayList<IPersonaje> lheroe = new ArrayList<>();
    ArrayList<IPersonaje> lmonstruo = new ArrayList<>();
    ArrayList<IPersonaje> lprincipe = new ArrayList<>();
    ArrayList<IPersonaje> lvillano = new ArrayList<>();

    public CCatalogoPersonajePrototipo() {
        CHeroe heroe = new CHeroe("Martin", "img1.png", 98.5, 178.1, 9, "Doble salto");
        CMonstruo monstruo = new CMonstruo("Abdul", "monter.jpeg", 123.8, 185.23, 2, "Carga de hombro");
        CPrincipe principe = new CPrincipe("Azul", "royal.jpg", 75.23, 179.4, 10, "Rapida regeneracion");
        CVillano villano = new CVillano("Esqueletor", "skull.gif", 50.45, 169.5, 4, "Reanimacion");
        lheroe.add(heroe);
        lmonstruo.add(monstruo);
        lprincipe.add(principe);
        lvillano.add(villano);
        asignaListasAVector();
    }

    void asignaListasAVector() {
        vector[0] = lheroe;
        vector[1] = lmonstruo;
        vector[2] = lprincipe;
        vector[3] = lvillano;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }


    private final Hashtable<String, IPersonaje> catalogo = new Hashtable<String, IPersonaje>();

    public void addPersonaje(String key, IPersonaje personaje) {
        catalogo.put(key, personaje);
    }

    public Object getPersonaje(String key) {
        return catalogo.get(key).clonar();
    }
    public ArrayList[] getVector(){
        return vector;
    }
    public Hashtable<String, IPersonaje> getCatalogo() {
        return catalogo;
    }

}

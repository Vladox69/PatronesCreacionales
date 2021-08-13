/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronobserver;

/**
 *
 * @author bamboozle for the foozle!!!
 */
public class DEMOPatronObserver {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.evento.subscribe("abrir", new LogRegistro("openFile.txt"));
        editor.evento.subscribe("guardar", new NotificacionEmail("admin@example.com"));

        try {
            editor.openFile("openFile.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

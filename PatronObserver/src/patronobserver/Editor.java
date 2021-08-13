/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template archivo, choose Tools | Templates
 * and open the template in the editor.
 */
package patronobserver;

/**
 *
 * @author bamboozle for the foozle!!!
 */
import java.io.File;

public class Editor {

    public AdminEventos evento;
    private File archivo;

    public Editor() {
        this.evento = new AdminEventos("abrir", "guardar");
    }

    public void openFile(String filePath) {
        this.archivo = new File(filePath);
        evento.notify("abrir", archivo);
    }

    public void saveFile() throws Exception {
        if (this.archivo != null) {
            evento.notify("guardar", archivo);
        } else {
            throw new Exception("Primero habre un archivo ... ");
        }
    }
}

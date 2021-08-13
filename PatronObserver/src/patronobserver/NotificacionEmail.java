/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronobserver;

import java.io.File;

/**
 *
 * @author bamboozle for the foozle!!!
 */
public class NotificacionEmail implements IEvento {
    private String email;

    public NotificacionEmail(String email) {
        this.email = email;
    }

    @Override
    public void actualizar(String tipoEvento, File archivo) {
        System.out.println("Email para  " + email + ": Alguien realizo el evento " + tipoEvento + " con el archivo: " + archivo.getName());
    }
}

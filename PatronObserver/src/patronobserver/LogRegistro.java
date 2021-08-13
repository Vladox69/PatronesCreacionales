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
public class LogRegistro implements IEvento {
    private File log;

    public LogRegistro(String archivo) {
        this.log = new File(archivo);
    }

    @Override
    public void actualizar(String tipoEvento, File archivo) {
        System.out.println("Cambio registrado en " + log + ": Alguien ha realizado el evento " + tipoEvento + " con el archivo: " + archivo.getName());
    }
}
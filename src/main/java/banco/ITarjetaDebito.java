/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author ASUS
 */
public interface ITarjetaDebito {
    String getDatosTarjetaDebito();
    String retirar();
    String ingresar();
    String pagar();
}

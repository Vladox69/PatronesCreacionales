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
public class TarjetaDebitoEstandar implements ITarjetaDebito{

    private String costo;

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }
    
    public TarjetaDebitoEstandar(){
        this.costo="5 euros";
    }
    
    @Override
    public String getDatosTarjetaDebito() {
        return "Tarjeta de débito:"+getCosto()+"\n";
    }
    
}

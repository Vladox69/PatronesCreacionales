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
public class TarjetaDebito10 implements ITarjetaDebito{

    private String costo;
    
    public TarjetaDebito10(){
        this.costo="Gratuita";
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }
    
    @Override
    public String getDatosTarjetaDebito() {
        return "Tarjeta de débito:"+getCosto()+"\n";
    }
    
}

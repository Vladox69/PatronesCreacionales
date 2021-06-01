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
public class TarjetaDebitoJoven implements ITarjetaDebito{

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    private String costo;
    
    public TarjetaDebitoJoven(){
        this.costo="Gratuita";
    }
    
    @Override
    public String getDatosTarjetaDebito() {
        return "Tarjeta de debito:"+getCosto()+"\n";
    }
    
}

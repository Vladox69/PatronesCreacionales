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
public class TarjetaCreditoOro implements ITarjetaCredito{

    private String costo;
    
    public TarjetaCreditoOro(){
        this.costo="Gratuita \n"+"60% pensión \n";
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }
    
    
    @Override
    public String getDatosTarjetaCredito() {
        return "Tarjeta de credito: \n"+getCosto();
    }
    
}

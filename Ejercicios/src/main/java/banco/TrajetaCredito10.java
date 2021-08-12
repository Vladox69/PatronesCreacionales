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
public class TrajetaCredito10 implements ITarjetaCredito{

    private String costo;

    public String getCosto() {
        return costo;
    }

    public void setGratuidad(String gratuidad) {
        this.costo = gratuidad;
    }
    
    public TrajetaCredito10(){
        this.costo="18 euros \n"+ "60% nómina";
    }
    
    @Override
    public String getDatosTarjetaCredito() {
        return "Tarjeta de crédito: \n"+getCosto()+"\n";
    }
    
    
    @Override
    public String retirar() {
        return "Realizando el retiro \n"+"Comprobando fondos de la cuenta \n"+"Retire su dinero \n";
    }

    @Override
    public String ingresar() {
        return "Realizando el ingreso \n"+"Ingrese el dinero en la ranura \n"+"Confirme la transacción \n";
    }

    @Override
    public String pagar() {
    return "Realizando el pago \n"+"Ingrese la clave \n";    
    }
    
}

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
public class CuentaOro implements ICuenta{
    
    private TarjetaCreditoOro tarjetaCredito;
    private TarjetaDebitoOro tarjetaDebito;
    private RegaloOro regalo;
    private String interes;

    public String getInteres() {
        return interes;
    }

    public void setInteres(String interes) {
        this.interes = interes;
    }
    
    public CuentaOro(){
        this.interes="Interés:1,5% \n";
    }
    
    @Override
    public void crear() {
        tarjetaCredito =new TarjetaCreditoOro();
        tarjetaDebito=new TarjetaDebitoOro();
        regalo=new RegaloOro();
    }

    @Override
    public String datosCuenta() {
        return "Datos de cuenta de oro:\n"
                +getInteres()
                +tarjetaCredito.getDatosTarjetaCredito()
                +tarjetaDebito.getDatosTarjetaDebito()
                +regalo.getDatosRegalo();
    }
    
}

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

    public TarjetaCreditoOro getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(TarjetaCreditoOro tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public TarjetaDebitoOro getTarjetaDebito() {
        return tarjetaDebito;
    }

    public void setTarjetaDebito(TarjetaDebitoOro tarjetaDebito) {
        this.tarjetaDebito = tarjetaDebito;
    }

    public RegaloOro getRegalo() {
        return regalo;
    }

    public void setRegalo(RegaloOro regalo) {
        this.regalo = regalo;
    }
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

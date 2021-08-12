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
public class CuentaEstandar implements ICuenta{
    private TarjetaDebitoEstandar tarjeta;
    private String interes;

    public TarjetaDebitoEstandar getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaDebitoEstandar tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getInteres() {
        return interes;
    }

    public void setInteres(String interes) {
        this.interes = interes;
    }
    
    public CuentaEstandar(){
        this.interes="Interés: 0,5% \n";
    }
    
    @Override
    public void crear() {
        tarjeta=new TarjetaDebitoEstandar();
    }

    @Override
    public String datosCuenta() {
        return "Datos de cuenta estandar"+"\n"
                +getInteres()
                +tarjeta.getDatosTarjetaDebito();
    }
    
}

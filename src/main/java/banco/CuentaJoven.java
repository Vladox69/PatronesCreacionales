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
public class CuentaJoven implements ICuenta{
    private TarjetaDebitoJoven tarjeta;
    private RegaloJoven regalo;
    private String interes;

    public String getInteres() {
        return interes;
    }

    public void setInteres(String interes) {
        this.interes = interes;
    }
    
    public CuentaJoven(){
        this.interes="Interés: 2% \n";
    }
    
    @Override
    public void crear() {
        tarjeta =new TarjetaDebitoJoven();
        regalo =new RegaloJoven();
    }

    @Override
    public String datosCuenta() {
        return "Datos de cuenta joven:\n"
                +getInteres()
                +tarjeta.getDatosTarjetaDebito()
                +regalo.getDatosRegalo();
    }
    
}

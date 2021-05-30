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
    
    @Override
    public void crear() {
        tarjeta =new TarjetaDebitoJoven();
        regalo =new RegaloJoven();
    }

    @Override
    public String datosCuenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

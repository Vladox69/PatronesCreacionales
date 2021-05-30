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
    
    
    @Override
    public void crear() {
        tarjeta=new TarjetaDebitoEstandar();
    }

    @Override
    public String datosCuenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

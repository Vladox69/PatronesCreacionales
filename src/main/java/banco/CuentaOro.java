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
    
    @Override
    public void crear() {
        tarjetaCredito =new TarjetaCreditoOro();
        tarjetaDebito=new TarjetaDebitoOro();
        regalo=new RegaloOro();
    }

    @Override
    public String datosCuenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

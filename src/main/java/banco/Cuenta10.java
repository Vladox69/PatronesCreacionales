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
public class Cuenta10 implements ICuenta {

    private TarjetaDebito10 tarjetaDebito;
    private TrajetaCredito10 tarjetaCredito;
    private Regalo10 regalo;

    @Override
    public void crear() {
        tarjetaCredito =new TrajetaCredito10();
        tarjetaDebito =new TarjetaDebito10();
        regalo=new Regalo10();
    }

    @Override
    public String datosCuenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

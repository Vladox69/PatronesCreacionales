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
public class FabricaCuentas implements IAbstractFactory{
    ICuenta cuenta;
    
    @Override
    public void crearProductos(String tipo) {
        if(tipo.equals("JOVEN")){
            cuenta=new CuentaJoven();
            cuenta.crear();
        }else if(tipo.equals("10")){
            cuenta=new Cuenta10();
            cuenta.crear();
        }else if(tipo.equals("ORO")){
            cuenta=new CuentaOro();
            cuenta.crear();
        }else if(tipo.equals("ESTANDAR")){
            cuenta=new CuentaEstandar();
            cuenta.crear();
        }
    }

    @Override
    public ICuenta crearCuenta() {
        return cuenta;
    }

    
}

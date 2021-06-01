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
public class DemoBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricaCuentas admin=new FabricaCuentas();
        Cuenta10 a=(Cuenta10) admin.crearCuenta("10");
        System.out.println(a.datosCuenta());
        System.out.println("-------------------------");
        CuentaJoven b=(CuentaJoven) admin.crearCuenta("JOVEN");
        System.out.println(b.datosCuenta());
        System.out.println("-------------------------");
        CuentaOro c=(CuentaOro) admin.crearCuenta("ORO");
        System.out.println(c.datosCuenta());
        System.out.println("-------------------------");
        CuentaEstandar d=(CuentaEstandar) admin.crearCuenta("ESTANDAR");
        System.out.println(d.datosCuenta());
    }
    
}

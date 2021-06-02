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

    public Cuenta10() {
        this.interes ="Interés:"+"\n"+ "1% de interés" 
                + "\n" + "50% descubierto" + "\n";
    }

    public String getInteres() {
        return interes;
    }

    public void setInteres(String interes) {
        this.interes = interes;
    }

    private String interes;
    private TarjetaDebito10 tarjetaDebito;
    private TrajetaCredito10 tarjetaCredito;
    private Regalo10 regalo;

    public TarjetaDebito10 getTarjetaDebito() {
        return tarjetaDebito;
    }

    public void setTarjetaDebito(TarjetaDebito10 tarjetaDebito) {
        this.tarjetaDebito = tarjetaDebito;
    }

    public TrajetaCredito10 getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(TrajetaCredito10 tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public Regalo10 getRegalo() {
        return regalo;
    }

    public void setRegalo(Regalo10 regalo) {
        this.regalo = regalo;
    }

    @Override
    public void crear() {
        tarjetaCredito = new TrajetaCredito10();
        tarjetaDebito = new TarjetaDebito10();
        regalo = new Regalo10();
    }

    @Override
    public String datosCuenta() {
        return "Datos cuenta 10 \n"+
                getInteres()
                + tarjetaCredito.getDatosTarjetaCredito()
                + tarjetaDebito.getDatosTarjetaDebito()
                + regalo.getDatosRegalo();
    }

}

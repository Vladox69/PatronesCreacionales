/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartera;

/**
 *
 * @author ASUS
 */
public class PlanDomestico implements Plan {

    private double horas;
    private double total;
    private final double COSTO_HORA_DOMESTICO = 2.5;

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public PlanDomestico(double horas){
        this.horas=horas;
        calculoPlan();
    }

    @Override
    public String getDatos() {
        return "Factura de PLAN DOMÉSTICO \n"+
                "Costo por hora:" +COSTO_HORA_DOMESTICO+" \n"+
                "Horas de consumo:"+getHoras()+" \n"+
                "TOTAL A PAGAR:"+getTotal()+" \n";
    }

    @Override
    public void calculoPlan() {
        this.total = this.horas * COSTO_HORA_DOMESTICO;
    }

}

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
public class FabricaPlan {

    Plan plan;

    public Plan crearPlan(String tipo,double horas) {
        if (tipo == null) {
            return null;
        } else if (tipo.equals("DOMESTICO")) {
            plan = new PlanDomestico(horas);
        } else if (tipo.equals("COMERCIAL")) {
            plan = new PlanComercial(horas);
        } else if (tipo.equals("INSTITUCIONAL")) {
            plan = new PlanInstitucional(horas);
        }
        return plan;
    }
}

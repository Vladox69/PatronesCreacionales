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
public class CrearPlan {

    Plan plan;

    public Plan crearPlan(String tipo) {
        if (tipo == null) {
            return null;
        } else if (tipo.equals("DOMESTICO")) {
            plan = new PlanDomestico();
        } else if (tipo.equals("COMERCIAL")) {
            plan = new PlanComercial();
        } else if (tipo.equals("INSTITUCIONAL")) {
            plan = new PlanInstitucional();
        }
        return plan;
    }
}

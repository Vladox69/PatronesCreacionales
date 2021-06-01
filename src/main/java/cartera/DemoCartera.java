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
public class DemoCartera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricaPlan fabrica=new FabricaPlan();
        System.out.println(fabrica.crearPlan("DOMESTICO",5).getDatos());
        System.out.println(fabrica.crearPlan("INSTITUCIONAL", 10).getDatos());
        System.out.println(fabrica.crearPlan("COMERCIAL", 7).getDatos());
        
        
        
    }
    
}

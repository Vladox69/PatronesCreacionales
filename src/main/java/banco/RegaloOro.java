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
public class RegaloOro implements IRegalo {

    private String regalo;

    public String getRegalo() {
        return regalo;
    }

    public void setRegalo(String regalo) {
        this.regalo = regalo;
    }
    
    public RegaloOro(){
        this.regalo="Seguro \n";
    }
    
    @Override
    public String getDatosRegalo() {
        return "Regalo:"+getRegalo();
    }
    
}

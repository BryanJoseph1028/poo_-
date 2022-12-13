/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
/**
 *
 * @author USUARIO
 */
public class Empleado extends Persona {
    private String cod_cliente,puesto;

    public String getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(String cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    @Override
    public void agregar(){
    System.out.println("Codigo del Puesto: " + this.getCod_cliente());
    System.out.println("Puesto: " + this.getPuesto());
    
    }
    
}

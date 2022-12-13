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
public class Cliente extends Persona {
    private String nit;
    public Cliente(){}
    public Cliente(String nit, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    @Override
    public void agregar(){
    System.out.println("Nit: " + this.getNit() );
    System.out.println("Nombres: " + this.getNombres() );
    System.out.println("Apellidos: " + this.getApellidos() );
    System.out.println("Direccion: " + this.getDireccion() );
    System.out.println("Telefono: " + this.getTelefono() );
    System.out.println("Fecha de Nacimiento: " + this.getFecha_nacimiento() );
    System.out.println("___________________________________________________");
    
    }
    
}

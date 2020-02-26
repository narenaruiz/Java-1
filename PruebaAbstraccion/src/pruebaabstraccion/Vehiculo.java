/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaabstraccion;

/**
 *
 * @author rafae
 */
public abstract class Vehiculo {
    private String matricula;
    private String bastidor;

    public Vehiculo() {
    }

    public Vehiculo(String matricula, String bastidor) {
        this.matricula = matricula;
        this.bastidor = bastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }
    public abstract void mostrarAbtraccion(int i);
    
    
}

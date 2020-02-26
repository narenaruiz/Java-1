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
public class Turismo extends Vehiculo{
    private int numPuertas;
    private double cilindrada;
    private int cilindros;

    public Turismo(int numPuertas, double cilindrada, int cilindros) {
        this.numPuertas = numPuertas;
        this.cilindrada = cilindrada;
        this.cilindros = cilindros;
    }

    public Turismo(int numPuertas, double cilindrada, int cilindros, String matricula, String bastidor) {
        super(matricula, bastidor);
        this.numPuertas = numPuertas;
        this.cilindrada = cilindrada;
        this.cilindros = cilindros;
    }

    @Override
    public void mostrarAbtraccion(int i) {
        System.out.println("soy el hijo implementado un método abstracto");
//nos vemos obligados a implementar el método
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Milagros
 */
public class Cuenta {

    private int numCuenta;
    private long dni;
    private int saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numCuenta, long dni, int saldoActual) {
        this.numCuenta = numCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numCuenta=" + numCuenta + ", dni=" + dni + ", saldoActual=" + saldoActual + '}';
    }

}

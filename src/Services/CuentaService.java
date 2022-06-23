/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Milagros
 */
public class CuentaService {

    Scanner scan = new Scanner(System.in);

    public Cuenta crearCuenta() {
        Cuenta cuent = new Cuenta();
        System.out.println("Ingrese el número de la cuenta");
        cuent.setNumCuenta(scan.nextInt());
        System.out.println("Ingrese el numero de DNI del cliente");
        cuent.setDni(scan.nextLong());
        System.out.println("Ingrese el monto del saldo actual");
        cuent.setSaldoActual(scan.nextInt());

        return cuent;
    }

    public void ingresarDinero(double ingreso, Cuenta cuent) {
        int saldo = (int) (cuent.getSaldoActual() + ingreso);
        cuent.setSaldoActual(saldo);
    }

    public void retirar(double retiro, Cuenta cuent) {
        if (retiro < cuent.getSaldoActual()){
        double saldoActual = cuent.getSaldoActual() - retiro;
        cuent.setSaldoActual((int) saldoActual);} else {
            System.out.println("No posee la cantidad de dinero deseada para retirar, su saldo pasara a ser 0");
            cuent.setSaldoActual(0);
        }
    }

    public void extraccionRapida(Cuenta cuent) {
        System.out.println("Ingrese la cantidad de dinero a retirar");
        double extraccion = scan.nextDouble();
        if (extraccion <= (cuent.getSaldoActual() * 20 / 100)) {
            System.out.println("Operación exitosa");
            int saldo = (int) (cuent.getSaldoActual() - extraccion);
            cuent.setSaldoActual(saldo);
        } else {
            System.out.println("La cantidad ingresada no es válida. Seleccione otra opción del menu");
        }
    }

    public void consultarSaldo(Cuenta cuent) {
        int saldo = cuent.getSaldoActual();
        System.out.println("Su saldo actual es de $" + saldo);
    }

    public void consultarDatos(Cuenta cuent) {
        System.out.println(cuent);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5poo;

import Entidad.Cuenta;
import Services.CuentaService;
import java.util.Scanner;

/**
 *
 * @author Milagros
 */
public class Ej5POO {

    /**
     * @param args the command line arguments Realizar una clase llamada Cuenta
     * (bancaria) que debe tener como mínimo los atributos: numeroCuenta
     * (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
     * Las operaciones asociadas a dicha clase son: a) Constructor por defecto y
     * constructor con DNI, saldo, número de cuenta e interés. b) Agregar los
     * métodos getters y setters correspondientes c) Metodo para crear un objeto
     * Cuenta, pidiéndole los datos al usuario. d) Método ingresar(double
     * ingreso): el método recibe una cantidad de dinero a ingresar y se la
     * sumara a saldo actual. e) Método retirar(double retiro): el método recibe
     * una cantidad de dinero a retirar y se la restará al saldo actual. Si la
     * cuenta no tiene la cantidad de dinero a retirar, se pondrá el saldo
     * actual en 0. f) Método extraccionRapida(): le permitirá sacar solo un 20%
     * de su saldo. Validar que el usuario no saque más del 20%. g) Método
     * consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
     * h) Método consultarDatos(): permitirá mostrar todos los datos de la
     * cuenta
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CuentaService cs = new CuentaService();
        Cuenta cuent = cs.crearCuenta();
        int opcion = 0;
        
        do {
        System.out.println("MENU");
        System.out.println("1) Ingresar dinero");
        System.out.println("2) Retiro de dinero");
        System.out.println("3) Extracción rápida");
        System.out.println("4) Consultar saldo");
        System.out.println("5) Consultar datos");
        System.out.println("6) Salir");

        opcion = scan.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Cantidad de dinero a ingresar $");
                double ingreso = scan.nextDouble();
                cs.ingresarDinero(ingreso, cuent);
                break;
            case 2:
                System.out.println("Ingrese la cantidad de dinero que desea retirar");
                double retiro = scan.nextDouble();
                cs.retirar(retiro, cuent);
                break;
            case 3:
                System.out.println("Extraccion rápida, le permite sacar hasta un 20% de su saldo");
                cs.extraccionRapida(cuent);
                break;
            case 4:
                cs.consultarSaldo(cuent);
                break;
            case 5:
                cs.consultarDatos(cuent);
                break;
            case 6:
                break;
        }
        } while (opcion != 6);
        
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

import java.util.Scanner;

/**
 *
 * @author EVADAFDIL
 */
public class CuentaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        Fecha fec = new Fecha();
        String nombreCliente, domicilioCliente, fechaNacimiento;
        double cantidadRetirar, cantidadDepositar;
        int opcion, dia, mes, año;       
        
        do{
            System.out.println(":: MENÚ DE CUENTA DE AHORRO ::");
            System.out.println("1. Realizar apertura");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Salir");                        
            opcion = in.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Introduzca año de nacimiento: ");            
                    año = in.nextInt();
                    if((2018-año)>=18)
                    {
                        System.out.println("Introduzca mes de nacimiento: ");            
                        mes = in.nextInt();
                        System.out.println("Introduzca día de nacimiento: ");            
                        dia = in.nextInt();
                        fec.setDia(dia);
                        fec.setMes(mes);
                        fec.setAño(año);
                        fechaNacimiento = fec.fechaConFormato();
                        cuenta.setFechaNacimiento(fechaNacimiento);
                        
                        System.out.println("Nombre del cliente: ");
                        in.nextLine();
                        nombreCliente = in.nextLine();
                        System.out.println("Domicilio: ");
                        domicilioCliente = in.nextLine();
                        cuenta.setNombreCliente(nombreCliente);
                        cuenta.setDomicilioCliente(domicilioCliente);
                        cuenta.realizarApertura(1000.00);                     
                    }
                    else
                        System.out.println("No es posible realizar la apertura de cuenta");
                    break;
                case 2:
                    System.out.println("Introduzca la cantidad a depositar: ");
                    cantidadDepositar = in.nextDouble();
                    cuenta.depositar(cantidadDepositar);
                    break;
                case 3:
                    System.out.println("Introduzca la cantidad a retirar: ");
                    cantidadRetirar = in.nextDouble();
                    if(cantidadRetirar <= cuenta.getSaldo())
                        cuenta.retirar(cantidadRetirar);
                    else
                        System.out.println("No cuenta con saldo para realizar el retiro");
                    break;
                case 4:
                    System.out.println("El saldo disponible es: "+cuenta.consultarSaldo());
                    break;
            }            
        }while(opcion!=5);
    }    
}

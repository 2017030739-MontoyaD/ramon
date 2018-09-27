/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

import java.util.Scanner;

public class BoletoMain {

    /**
     * @param args the command line arguments
     */
    //Falta numero Boleto
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dia, mes, año, tipoBoleto, edad;
        float precio, totalPagar;
        String nombre, fecha, destino;
        Fecha hoy = new Fecha();    //Constructor por omisión
        Boleto bol = new Boleto();
        
        System.out.println(":: AGENCIA DE VIAJES EL DESTINO FELIZ ::");

        //Pedir datos
        System.out.println("Numero de boleto: "+bol.getNumeroBoleto());
        System.out.println("Nombre: ");
        nombre = in.nextLine();
        System.out.println("Precio: ");
        precio = in.nextFloat();     
        System.out.println("Tipo de boleto (1. Sencillo 2. Doble): ");
        tipoBoleto = in.nextInt();            
        System.out.println("Destino: ");
        in.nextLine();
        destino = in.nextLine();
        System.out.println("Edad: ");
        edad = in.nextInt();                    

        bol.setNombreCliente(nombre);
        bol.setPrecio(precio);
        bol.setTipoBoleto(tipoBoleto);
        bol.setDestino(destino);

        System.out.println("Dame el día: ");
        dia = in.nextInt();
        System.out.println("Dame el mes: ");
        mes = in.nextInt();
        System.out.println("Dame el año: ");
        año = in.nextInt();                    
        hoy.setDia(dia);
        hoy.setMes(mes);
        hoy.setAño(año);
        fecha = hoy.fechaConFormato();
        bol.setFecha(fecha);

        //Proceso de cobro
        totalPagar = bol.calcularSubtotal() + bol.calcularImpuesto()
                - bol.calcularDescuento(edad);
        System.out.println("TOTAL A PAGAR: "+totalPagar);                    
    }
}

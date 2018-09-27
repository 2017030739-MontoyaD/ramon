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
public class CotizacionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cotizacion cot = new Cotizacion();
        int plazo;
        String descripcion;
        double precio, porcentajePagoInicial;
        
        
            System.out.println(":: COTIZACIÓN DE AUTOMÓVIL ::");
                            
            System.out.println("Numero de cotización: "+cot.getNumCotizacion());
            System.out.println("Descripción: ");
            descripcion = in.nextLine();
            System.out.println("Precio: ");
            precio = in.nextDouble();        
            System.out.println("Porcentaje de pago inicial (%): ");
            porcentajePagoInicial = in.nextDouble();
            System.out.println("Plazo en meses: ");
            plazo = in.nextInt();
                    
            cot.setDescripcion(descripcion);
            cot.setPrecio(precio);
            cot.setPorcentajePagoInicial(porcentajePagoInicial);
            cot.setPlazo(plazo);

            System.out.println("PAGO INICIAL: "+cot.calcularPagoInicial());
            System.out.println("TOTAL A FINANCIAR: "+cot.calcularTotalFinanciar());
            System.out.println("PAGO MENSUAL: "+cot.calcularPagoMensual());
    }
    
}
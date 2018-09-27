/*
 * Examen I Unidad.
 */
package bombagasolina;

import java.util.Scanner;

/**
 *
 * @author Montoya Herrera Dilian Dafne     INF 4-4
 */
public class BombaGasolinaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion, numLitros=0;
        BombaGasolina bomba = new BombaGasolina();
        Scanner in = new Scanner(System.in);
        
        do{
            System.out.println("1. Iniciar bomba");
            System.out.println("2. Verificar inventario");
            System.out.println("3. Hacer una venta");
            System.out.println("4. Calcular la venta total");
            System.out.println("5. Salir");
            System.out.print("Su opción: ");
            opcion = in.nextInt();
            switch(opcion)
            {
                case 1:
                    bomba.iniciarBomba();
                    System.out.println("Se ha iniciado la bomba.");
                    break;
                case 2:
                    System.out.println("La cantidad de litros disponibles es: "
                            +bomba.verificarInventario());
                    break;
                case 3:
                    System.out.println("¿Cuántos litros desea comprar?");
                    numLitros = in.nextInt();
                    if(bomba.verificarInventario() >= numLitros)
                    {
                        System.out.println("El costo de la venta es: "
                                +bomba.realizarVenta(numLitros));
                    }
                    else
                        System.out.println("Lo sentimos, no contamos con la gasolina suficiente en nuestro inventario");
                    break;
                case 4:
                    System.out.println("La venta total es de: $"
                            +bomba.calcularVentaTotal());
                    break;
                case 5:
                    System.out.println("Gracias por su preferencia, hasta pronto");
                    break;
                default:
                    System.out.println("Por favor, seleccione una opción correcta");
            }
        }while(opcion!=5);
    }
    
}

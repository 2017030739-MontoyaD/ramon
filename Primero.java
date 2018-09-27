/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Primero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dia, mes, año, opcion;
        Fecha hoy = new Fecha();    //Constructor por omisión
        
        do{
            System.out.println("1. Iniciar objeto");
            System.out.println("2. Consultar Fecha");
            System.out.println("3. Cuantos días tiene el mes");
            System.out.println("4. Es año bisiesto");
            System.out.println("5. Modificar fecha");
            System.out.println("6. Salir");
            
            opcion = in.nextInt();
            
            switch(opcion)
            {
                case 1:
                    System.out.println("Dame el día: ");
                    dia = in.nextInt();
                    System.out.println("Dame el mes: ");
                    mes = in.nextInt();
                    System.out.println("Dame el año: ");
                    año = in.nextInt();
                    
                    hoy.setDia(dia);
                    hoy.setMes(mes);
                    hoy.setAño(año);
                    
                    break;
                case 2:
                    System.out.println("La fecha es: "+hoy.fechaConFormato());
                    break;
                case 3:
                    mes = hoy.getMes();
                    System.out.println("El mes num "+mes+" tiene "+hoy.diasMeses());
                    break;
                case 4:
                    if(hoy.isBisiesto())
                    {
                        System.out.println("El año "+hoy.getAño()+" es bisiesto");
                    }
                    else
                    {
                        System.out.println("El año "+hoy.getAño()+" no es bisiesto");
                    }
                    break;
                case 5:
                    do{
                        System.out.println("Que desea modificar: ");
                        System.out.println("1. Dia");
                        System.out.println("2. Mes");
                        System.out.println("3. Año");
                        System.out.println("4. Regresar");
                        opcion = in.nextInt();

                        switch(opcion)
                        {
                            case 1:
                                System.out.println("Dame el día: ");
                                dia = in.nextInt();
                                hoy.setDia(dia);
                                break;
                            case 2:
                                System.out.println("Dame el mes: ");
                                mes = in.nextInt();
                                hoy.setMes(mes);
                                break;
                            case 3:
                                System.out.println("Dame el año: ");
                                año = in.nextInt();
                                hoy.setAño(año);
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("No es una opcion válida");
                        }
                    }while(opcion!=4);
                    break;
                case 6:
                    System.out.println("Gracias, hasta la vista");
                    break;
                default:
                    System.out.println("No es una opcion válida");
            }
            
            System.out.println("Oprima cualquier tecla para continuar...");
            in.nextInt();
            
        }while(opcion!=6);
        
        
    }
    
}

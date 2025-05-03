
package reto1;

import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Control mycontrol = new Control();   
        Scanner input = new Scanner (System.in);
       
        while (true){
            System.out.println("PAGO DE SERVICIOS PÚBLICOS");
            System.out.println("Seleccione el servicio público:");
            System.out.println("1. Energia");
            System.out.println("2. Acueducto");
            System.out.println("3. Gas Natural");
            System.out.println("4. Salir");
            
            int opcion = input.nextInt();
            
            System.out.println("Opción:");
     
            if (opcion==1){
                System.out.println("Pago de servicio de energía");
                System.out.println("Estrato del inmueble:");
                int estrato = input.nextInt();
                System.out.println("Consumo del inmueble:");
                int consumo = input.nextInt();
                
                System.out.println("El consumo fue: "+consumo);
                float tarifa_unidad = mycontrol.energia.precio;
                float consumototal = mycontrol.energiaTotal(consumo);
                float turbaIracunda = consumototal*(mycontrol.turbaIracunda());
                System.out.println("Valor unidad: "+tarifa_unidad);
                System.out.println("Estrato del inmueble: "+estrato);
                System.out.println("Costo total: "+consumototal);
                
                if (estrato<=2){
                    float descuento= mycontrol.descuento1y2()*mycontrol.energiaTotal(consumo);
                    float total_a_pagar=consumototal+turbaIracunda-descuento;
                    System.out.println("Descuento o sobrecosto: -"+descuento);
                    System.out.println("Impuesto por infraestructura: "+turbaIracunda);
                    System.out.println("TOTAL A PAGAR: "+total_a_pagar);
                    System.out.println(" ");
                    
                }
                else if (estrato>=3 && estrato<=4){
                    float descuento= mycontrol.descuento3y4()*mycontrol.energiaTotal(consumo);
                    float total_a_pagar= consumototal+turbaIracunda-descuento;
                    System.out.println("Descuento o sobrecosto: -"+descuento);
                    System.out.println("Impuesto por infraestructura: "+turbaIracunda);
                    System.out.println("TOTAL A PAGAR: "+total_a_pagar);
                    System.out.println(" ");
                    
                }
                
                else if (estrato>=5 && estrato<=6){
                    float sobrecosto= mycontrol.sobrecosto5y6()*mycontrol.energiaTotal(consumo);
                    float total_a_pagar= consumototal+turbaIracunda+sobrecosto;
                    System.out.println("Descuento o sobrecosto: "+sobrecosto);
                    System.out.println("Impuesto por infraestructura: "+turbaIracunda);
                    System.out.println("TOTAL A PAGAR: "+total_a_pagar);
                    System.out.println(" ");
                    }
            }  
                
                
                
             if (opcion==2){
                System.out.println("Pago de servicio de acueducto");
                System.out.println("Estrato del inmueble:");
                int estrato = input.nextInt();
                System.out.println("Consumo del inmueble:");
                int consumo = input.nextInt();
                
                System.out.println("El consumo fue: "+consumo);
                float tarifa_unidad = mycontrol.acueducto.precio;
                float consumototal = mycontrol.aguaTotal(consumo);
                float turbaIracunda = consumototal*(mycontrol.turbaIracunda());
                System.out.println("Valor unidad: "+tarifa_unidad);
                System.out.println("Estrato del inmueble: "+estrato);
                System.out.println("Costo total: "+consumototal);
                
                if (estrato<=2){
                    float descuento= mycontrol.descuento1y2()*mycontrol.aguaTotal(consumo);
                    float total_a_pagar=consumototal+turbaIracunda-descuento;
                    System.out.println("Descuento o sobrecosto: -"+descuento);
                    System.out.println("Impuesto por infraestructura: "+turbaIracunda);
                    System.out.println("TOTAL A PAGAR: "+total_a_pagar);
                    System.out.println(" ");    
                    }
                else if (estrato>=3 && estrato<=4){
                    float descuento= mycontrol.descuento3y4()*mycontrol.aguaTotal(consumo);
                    float total_a_pagar= consumototal+turbaIracunda-descuento;
                    System.out.println("Descuento o sobrecosto: -"+descuento);
                    System.out.println("Impuesto por infraestructura: "+turbaIracunda);
                    System.out.println("TOTAL A PAGAR: "+total_a_pagar);
                    System.out.println(" ");
                    }
                
                else if (estrato>=5 && estrato<=6){
                    float sobrecosto= mycontrol.sobrecosto5y6()*mycontrol.aguaTotal(consumo);
                    float total_a_pagar= consumototal+turbaIracunda+sobrecosto;
                    System.out.println("Descuento o sobrecosto: "+sobrecosto);
                    System.out.println("Impuesto por infraestructura: "+turbaIracunda);
                    System.out.println("TOTAL A PAGAR: "+total_a_pagar);
                    System.out.println(" ");
                    }
             }
            if (opcion==3){
                System.out.println("Pago de servicio de gas natural");
                System.out.println("Estrato del inmueble:");
                int estrato = input.nextInt();
                System.out.println("Consumo del inmueble:");
                int consumo = input.nextInt();
                
                System.out.println("El consumo fue: "+consumo);
                float tarifa_unidad = mycontrol.gas.precio;
                float consumototal = mycontrol.gasTotal(consumo);
                float turbaIracunda = consumototal*(mycontrol.turbaIracunda());
                System.out.println("Valor unidad: "+tarifa_unidad);
                System.out.println("Estrato del inmueble: "+estrato);
                System.out.println("Costo total: "+consumototal);
                
                if (estrato<=2){
                    float descuento= mycontrol.descuento1y2()*mycontrol.aguaTotal(consumo);
                    float total_a_pagar=consumototal+turbaIracunda-descuento;
                    System.out.println("Descuento o sobrecosto: -"+descuento);
                    System.out.println("Impuesto por infraestructura: "+turbaIracunda);
                    System.out.println("TOTAL A PAGAR: "+total_a_pagar);
                    System.out.println(" ");    
                    }
                else if (estrato>=3 && estrato<=4){
                    float descuento= mycontrol.descuento3y4()*mycontrol.gasTotal(consumo);
                    float total_a_pagar= consumototal+turbaIracunda-descuento;
                    System.out.println("Descuento o sobrecosto: -"+descuento);
                    System.out.println("Impuesto por infraestructura: "+turbaIracunda);
                    System.out.println("TOTAL A PAGAR: "+total_a_pagar);
                    System.out.println(" ");
                    }
                else if (estrato>=5 && estrato<=6){
                    float sobrecosto= mycontrol.sobrecosto5y6()*mycontrol.gasTotal(consumo);
                    float total_a_pagar= consumototal+turbaIracunda+sobrecosto;
                    System.out.println("Descuento o sobrecosto: "+sobrecosto);
                    System.out.println("Impuesto por infraestructura: "+turbaIracunda);
                    System.out.println("TOTAL A PAGAR: "+total_a_pagar);
                    System.out.println(" ");
                    }
            }
            else if (opcion==4){
                System.out.println("Hasta pronto");
                break;
        }
            }
        }
}
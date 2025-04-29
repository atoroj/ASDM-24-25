    package practicafacade;
import java.util.ArrayList;
import java.util.Scanner;
public class Menu implements I_Menu{
    String fecha_actualizacion;
    private I_Pizza[] menu=new Pizza[10];
    
   
    int cantidad;
    Menu(){
   
        cantidad=0;
    }
       
    public void actualizaMenu(){
        Scanner sc=new Scanner(System.in);
        String nombre, i1,i2,i3;
        Pizza p;
        
        if(cantidad<10){
            System.out.println("Introduzca nombre: ");
            nombre=sc.nextLine();
            System.out.println("Introduzca ingrediente1: ");
            i1=sc.nextLine();
            System.out.println("Introduzca ingrediente2: ");
            i2=sc.nextLine();
            System.out.println("Introduzca ingrediente3: ");
            i3=sc.nextLine();
            p=new Pizza(nombre, i1,i2,i3);
   
            menu[cantidad++]=p;
        }
        else
            System.out.println("El Menu esta completo");
    }
    
    public void muestraMenu(){
        for(int i=0;i<cantidad;i++){
            System.out.println("Pizza " + cantidad);
        
            menu[i].mostrar_Descripcion();
        }
    }
    
    @Override
    public I_Pizza escogerPizza(){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Qué modelo de pizza quiere: ");
        muestraMenu();
        System.out.println("elija un numero de las pizzas mostradas: ");
        int tipo=sc.nextInt();
        return menu[tipo];
        
    }
}

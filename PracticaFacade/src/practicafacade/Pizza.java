package practicafacade;

public class Pizza implements I_Pizza {
    String nombre="Carbonara";;
    String ingrediente1="Bacon";
    String ingrediente2="Nata";
    String ingrediente3="Mozzarela";
    String FechaPedido;
   
    public Pizza(String n, String i1, String i2, String i3) {
        nombre=n; 
        ingrediente1=i1;
        ingrediente2=i2;
        ingrediente3=i3;
    }
    
    public void mostrar_Descripcion(){
        System.out.println("Pizza " + nombre);
        System.out.println("Los ingredientes son\n " + "\nIngrediente 1: " +  ingrediente1+
                "\nIngrediente 2: " +ingrediente2+ "\nIngrediente 3: "+ ingrediente3);
        System.out.println("\nAdios");
    }
}

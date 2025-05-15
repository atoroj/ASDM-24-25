
package practicaiterator;


public class Pedido implements I_Pedido{
    int cantidad;
    String fecha_pedido;
    private I_Pizza[] pedido=new Pizza[10];
    Cliente cliente;
    
    Pedido(Cliente c){
        cantidad=0;
        cliente=c;
        
    }


    @Override
    public void añadir_Apedido(I_Pizza p) {
        
        if(cantidad<10)
            pedido[cantidad++]=p;
        else
            System.out.println("Se ha producido un error");
    }

    @Override
    public void tramitar_Pedido() {
        System.out.println("El pedido será tramitado");
    }
    
    @Override
    public void mostrar_Pedido(){
        System.out.println("Este es el pedido que usted a realizado\n");
        for(int i=0;i<cantidad;i++)
            pedido[i].mostrar_Descripcion();
    }

    public String getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(String fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }
    
    
}

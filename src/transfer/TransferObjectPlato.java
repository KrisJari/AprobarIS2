package transfer;
import objects.Plato;

public class TransferObjectPlato extends Plato{
     public TransferObjectPlato(int precio, String nombre, String ingrediente){
     
        this.precio = precio;
        this.nombre = nombre;
        this.ingrediente = ingrediente;
     
     }
     
     public int getPrecio(String nombre){
        return precio;
    }
    
    public String getNombrePlato(){
        return nombre ;
    }
   
    public String getIngredienteCaract(){
        return ingrediente;
    }
    
    public void setIngrediente(String ingrediente){
        this.ingrediente = ingrediente;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }     
}

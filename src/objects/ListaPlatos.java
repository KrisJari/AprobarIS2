
package objects;

import java.util.ArrayList;
import java.util.List;


public class ListaPlatos{
       
    List<Plato> ListaPlato =new ArrayList<Plato>();
    
    public void addPlato(Plato plato){
        ListaPlato.add(plato);
    }
    
}

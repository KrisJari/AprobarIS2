/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import objects.ListaPlatos;
import objects.Plato;
import transfer.TransferObjectPlato;

/**
 *
 * @author Nico
 */
public class DaoPlato implements FachadaDAOPlato{
    //SOLO ES LLAMAR A LAS RESPECTIVAS FUNCIONES DE LA BD + EN BUSCAR HAY QUE HACER ALGO CON LOS NULL?
    public DaoPlato(TransferObjectPlato transf){
    
    }
   
    @Override
    public boolean crearPlato(Plato plato) {
        
        return true;
    }

    @Override
    public boolean modificarPlato(Plato plato) {
        return true;
    }

    @Override
    public boolean borarPlato(int id) {
        return true;
    }

    @Override
    public ListaPlatos buscarPlatos(String nombre, int precio, String Ingrediente) {
        ListaPlatos listaplatos = new ListaPlatos();
        
        return listaplatos;
    }

    @Override
    public Plato consultarPlato(int id) {
      
        return null;
    }
}

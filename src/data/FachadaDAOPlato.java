/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import objects.ListaPlatos;
import objects.Plato;

/**
 *
 * @author Nico
 */
public interface FachadaDAOPlato {
    
    public boolean crearPlato(Plato plato);
    
    public boolean modificarPlato(Plato plato);
    
    public boolean borarPlato(int id);
    
    public ListaPlatos buscarPlatos(String nombre, int precio, String Ingrediente);
    
    public Plato consultarPlato(int id);
    
    
}

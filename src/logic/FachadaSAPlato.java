/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import objects.ListaPlatos;
import objects.Plato;

/**
 *
 * @author Nico
 */
public interface FachadaSAPlato {
    
   public boolean crearPlato(Plato plato);
   public boolean modificarPlato(Plato plato);
   public boolean eliminalPlato(int id);
   public Plato consultarPlato(int id);
   public ListaPlatos buscarPlatos(int precio, String nombre, String ingrediente);
   
    
}

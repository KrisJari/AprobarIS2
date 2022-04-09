package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import objects.ListaPlatos;
import objects.Plato;

 public class BDConnect{
      private static Connection con;
     public static final String DRIVER = "com.mysql.jdbc.Driver";
     public static final String USER = "root";
     public static final String PASSWORD = "password2";
     public static final String URL = "jbdc:mysql://localhost:3306/pastapertutti";
     
   
    
    public boolean insertPlato(Plato plato){//CREAR
        
        // Declaramos la conexion a mysql
        boolean exito = false;

        // Funcion que va conectarse a mi bd de mysql
        // Reseteamos a null la conexion a la bd
        con=null;
        try{
            Class.forName(DRIVER);
            // Nos conectamos a la bd
            con= (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            Statement stmt=con.createStatement();
            stmt.executeUpdate("INSERT INTO plato VALUES(" +plato.nombre + "," + plato.precio + ")");
            if (con!=null){
                exito = true;
            }
        }
        // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e){
           exito = false;
        }
        return exito;
    }//HAY QUE TENER EN CUENTA EL ORDEN EN CADA BASE DE DATOS
    public Plato getPlato(String nombre){ //CONSULTAR
        // Declaramos la conexion a mysql
        boolean exito = false;

        // Funcion que va conectarse a mi bd de mysql
        // Reseteamos a null la conexion a la bd
        con=null;
        try{
            Class.forName(DRIVER);
            // Nos conectamos a la bd
            con= (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            Statement stmt=con.createStatement();
            stmt.executeQuery("SELECT Precio FROM plato WHERE nombre =)"+ nombre);
            //Crea un objeto de transferencia
     
            if (con!=null){
                exito = true;
            }
        }
        // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e){
           exito = false;
        }
    
    return null;//Devuelve el objeto de transferencia
    }
    public boolean deletePlato(String nombre){//ELIMINAR
        // Declaramos la conexion a mysql
        boolean exito = false;

        // Funcion que va conectarse a mi bd de mysql
        // Reseteamos a null la conexion a la bd
        con=null;
        try{
            Class.forName(DRIVER);
            // Nos conectamos a la bd
            con= (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            Statement stmt=con.createStatement();
            stmt.executeUpdate("DELETE * FROM plato WHERE nombre =" + nombre);
            if (con!=null){
                exito = true;
            }
        }
        // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e){
           exito = false;
        }
    
    return exito;
    }
    public boolean modifyPlato(Plato plato){
        
    // Declaramos la conexion a mysql
        boolean exito = false;

        // Funcion que va conectarse a mi bd de mysql
        // Reseteamos a null la conexion a la bd
        con=null;
        try{
            Class.forName(DRIVER);
            // Nos conectamos a la bd
            con= (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            Statement stmt=con.createStatement();
                stmt.executeUpdate("UPDATE plato SET column1 ="+ plato.nombre + ", column2 =" + plato.precio +"WHERE nombre ="+plato.nombre);//HAY QUE TENER EN CUENTA EL ORDEN EN CADA BASE DE DATOS

            if (con!=null){
                exito = true;
            }
        }
        // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e){
           exito = false;
        }
    
    return exito;
    }//HAY QUE TENER EN CUENTA EL ORDEN EN CADA BASE DE DATOS
    public ListaPlatos searchPlato(int precio, String nombre, String ingrediente){
        
        // Declaramos la conexion a mysql
        boolean exito = false;

        // Funcion que va conectarse a mi bd de mysql
        // Reseteamos a null la conexion a la bd
        con=null;
        try{
            Class.forName(DRIVER);
            // Nos conectamos a la bd
            con= (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            Statement stmt=con.createStatement();
                stmt.executeUpdate("SELECT * FROM plato WHERE nombre =" + nombre + " OR precio = " +precio);//HAY QUE TENER EN CUENTA EL ORDEN EN CADA BASE DE DATOS

            if (con!=null){
                exito = true;
            }
        }
        // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e){
           exito = false;
        }  
        
        return null;
    }
 }
    
    

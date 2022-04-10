package objects;
//--------------------------------------------------------
public class Plato {
//Constantes----------------------------------------------
    private static final int MAX_LENGTH_ID = 5;
//Atributos de clase--------------------------------------
    private static int  contador;
//Atributos-----------------------------------------------
    private String      id;
    private String      nombre;
    private int         precio;
    private boolean     oferta;
    private String[]    ingredientes;
    private String[]    alergenos;
//Constructores-------------------------------------------
    public Plato(
        String      id,
        String      nombre,
        int         precio,
        boolean     oferta,
        String[]    ingredientes,
        String[]    alergenos)
    {
            if (id.length() != MAX_LENGTH_ID)
                throw new IllegalArgumentException("ERROR: El ID no sigue el convenio establecido");                
            else this.id = id;
            this.nombre         = nombre;
            this.precio         = precio;
            this.oferta         = oferta;
            this.ingredientes   = ingredientes.clone();//?
            this.alergenos      = alergenos.clone();//?
            Plato.contador++;
    }
    //constructor de copia
    private Plato(Plato copiado){
        this.id             = copiado.getId();
        this.nombre         = copiado.getNombre();
        this.precio         = copiado.getPrecio();
        this.oferta         = copiado.isOferta();
        this.ingredientes   = copiado.getIngredientes();
        this.alergenos      = copiado.getAlergenos();
    }
//Getters-------------------------------------------------
    public static int getContador() {
        return contador;
    }
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public int getPrecio() {
        return precio;
    }
    public boolean isOferta() {
        return oferta;
    }
    public String[] getIngredientes() {
        return ingredientes;
    }
    public String[] getAlergenos() {
        return alergenos;
    }
//Setters--------------------------------------------------
    public static void setContador(int contador) {
        Plato.contador = contador;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void setOferta(boolean oferta) {
        this.oferta = oferta;
    }
    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }
    public void setAlergenos(String[] alérgenos) {
        this.alergenos = alérgenos;
    }
//Utils---------------------------------------------------
    @Override
    public String toString() {
        String resul =  super.toString() +
        "/n Nombre: " + this.nombre +
        "/n Precio: " + this.precio +
        "/n Oferta: ";
        if (this.oferta) resul += "Si";
        else resul += "No";
        resul += "/n Ingredientes: [";
        for (int i = 0; i < this.ingredientes.length; i++) {
            resul += ingredientes[i];
            if (!(i == this.ingredientes.length - 2)) resul += ", ";
        }
        resul += "]" + "/n Alergenos: [";
        for (int i = 0; i < this.alergenos.length; i++) {
            resul += alergenos[i];
            if (!(i == this.alergenos.length - 2)) resul += ", ";
        }
        resul += "]";
        return resul;
    }
    public boolean equals(Plato obj) {
        /*
        Nuestro criterio de comparación esta basado en comprobar primero el id
        y despues el nombre. Con esto podemos usar el método para dos criterios
        de orden:
            ·Si ocupan la misma posición en la lista (mismo ID).
            ·Si dos objetos distintos tienen el mismo nombre (rompemos unicidad).
        */
        return this.getId() == obj.getId() || this.nombre == obj.getNombre();
    }
    public Plato clone() {
        return new Plato(this);
    }    
}//class end
package lab6p2_hectorhernandez_12211096;

/**
 *
 * @author Hector
 */
public class Alimento {
    private String nombre;
    private Categoria categoria;
    private int costo;
    private int calorias;

    public Alimento() {
    }

    public Alimento(String nombre) {
        this.nombre = nombre;
    }
    

    public Alimento(String nombre, Categoria categoria, int costo, int calorias) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.costo = costo;
        this.calorias = calorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "Alimento = " + "Nombre = " + nombre + ", Categoria = " + categoria + ", Costo = " + costo + ", Calorias = " + calorias;
    }
    
    
    
}


package lab6p2_hectorhernandez_12211096;

import java.util.ArrayList;

/**
 *
 * @author Hector
 */
public class Jugador {
    private String nombre;
    private String usuario;
    private int nivel;
    private int consumo;
    private Alimento alimento;
    private ArrayList <Jugador> amigos_gordos = new ArrayList();
    private ArrayList <Jugador> solicitudes = new ArrayList();
    private Billetera billetera;

    public Jugador() {
    }

    public Jugador(String nombre, String usuario, int nivel, int consumo, Alimento alimento, Billetera billetera) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.nivel = nivel;
        this.consumo = consumo;
        this.alimento = alimento;
        this.billetera = billetera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public Alimento getAlimento() {
        return alimento;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }

    public ArrayList<Jugador> getAmigos_gordos() {
        return amigos_gordos;
    }

    public void setAmigos_gordos(ArrayList<Jugador> amigos_gordos) {
        this.amigos_gordos = amigos_gordos;
    }

    public ArrayList<Jugador> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<Jugador> solicitudes) {
        this.solicitudes = solicitudes;
    }

    public Billetera getBilletera() {
        return billetera;
    }

    public void setBilletera(Billetera billetera) {
        this.billetera = billetera;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", usuario=" + usuario + ", nivel=" + nivel + ", consumo=" + consumo + ", alimento=" + alimento + ", amigos_gordos=" + amigos_gordos + ", solicitudes=" + solicitudes + ", billetera=" + billetera + '}';
    }
    
    
    
}

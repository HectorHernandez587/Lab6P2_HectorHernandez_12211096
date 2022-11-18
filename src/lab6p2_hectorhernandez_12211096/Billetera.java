package lab6p2_hectorhernandez_12211096;

/**
 *
 * @author Hector
 */
public class Billetera {
    private int consumo;
    private int costo;

    public Billetera() {
    }

    public Billetera(int consumo, int costo) {
        this.consumo = consumo;
        this.costo = costo;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Billetera{" + "consumo=" + consumo + ", costo=" + costo + '}';
    }
    
    
    
}

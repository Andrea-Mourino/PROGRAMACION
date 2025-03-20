public class FluidosCombust extends TransporteMerc{

    private String Tipo;
    private int VolumTRansporte;
    private int NumDepositos;

    public int getPrezo() {
        return prezo;
    }

    public void setPrezo(int prezo) {
        this.prezo = prezo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public int getVolumTRansporte() {
        return VolumTRansporte;
    }

    public void setVolumTRansporte(int volumTRansporte) {
        VolumTRansporte = volumTRansporte;
    }

    public int getNumDepositos() {
        return NumDepositos;
    }

    public void setNumDepositos(int numDepositos) {
        NumDepositos = numDepositos;
    }

    public int prezo;


    public FluidosCombust(int TransporteMerc, int LiñasRegViaj) {
        super(TransporteMerc, LiñasRegViaj);
    }
}

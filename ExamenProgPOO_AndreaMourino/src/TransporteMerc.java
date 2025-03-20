public class TransporteMerc extends Navieira {
    private int Contenedores;
    private double FluidosCombust;

    public double getFluidosCombust() {
        return FluidosCombust;
    }

    public void setFluidosCombust(double fluidosCombust) {
        FluidosCombust = fluidosCombust;
    }

    public int getContenedores() {
        return Contenedores;
    }

    public void setContenedores(int contenedores) {
        Contenedores = contenedores;
    }





    public TransporteMerc(int TransporteMerc, int LiñasRegViaj) {
        super(TransporteMerc, LiñasRegViaj);
    }
}

public class APP {
    public static void main(String[] args) {
        TransporteMerc  BarcoP1 = new TransporteMerc ("España", "Pepe", "2021", "0000000W", 25, "01/01/2021", 30, 200, 400, 15);
        LiñasRegViaj BarcoP2 = new LiñasRegViaj ("Francia", "Pablo", "2024", "0005500W", 27, "09/11/2024", 31, 220, 480, 17);

        System.out.println(TransporteMerc.aCadea());
        System.out.println(LiñasRegViaj.aCadea());


        Prezo Contenedores [] = new Contenedores[2];
        Contenedores[0]=gastos;
        Contenedores[1]=gastos;
        double resta =0;
        for(Contenedores mem:TransporteMerc){
            resta = resta +mem.calcularGastos();
        }
        System.out.println(resta);
    }

}
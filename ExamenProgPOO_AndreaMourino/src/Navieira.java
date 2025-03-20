//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public abstract class Navieira {
    public int TransporteMerc;
    public int LiñasRegViaj;


    public int getLiñasRegViaj() {
        return LiñasRegViaj;
    }

    public void setLiñasRegViaj(int liñasRegViaj) {
        LiñasRegViaj = liñasRegViaj;
    }

    public int getTransporteMerc() {
        return TransporteMerc;
    }

    public void setTransporteMerc(int transporteMerc) {
        TransporteMerc = transporteMerc;
    }


    public Navieira(int TransporteMerc, int LiñasRegViaj) {
        this.TransporteMerc = TransporteMerc;
        this.LiñasRegViaj = LiñasRegViaj;
    }

}

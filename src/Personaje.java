public class Personaje {
    //nombre del personaje
    String nome;
    //las vidas
    int vidas;

    /**
     * Constructor por defecto
     */

    public Personaje () {
        this.nome= "Mutenroy";
        this.vidas= 1000;

    }

    /**
     * Constructor por defecto
     * @param nombre del personaje
     */

    Personaje(String nuevoNombre) {
        this.nome= nuevoNombre;
        this.vidas= 100;
    }

    /**
     * Disminuye la vida segun el daño
     * @param danho es el daño causado
     * @return vidas que me quedan
     */

    public int perderVidas (int danho){
        if (danho>0) danho =0;
        vidas= vidas - danho;
        if (vidas<0) vidas=0;
        return vidas;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(){
        this.nome= nome;
    }

    public int getVidas (){
        return vidas;
    }

    public void setVidas (int vida) {
        this.vidas= vida;
    }
}
public class Contenedores extends TransporteMerc{

    public String Bandeira;
    private String nome;
    private int ano;
    private String matricula;
    private int NumLicencia;
    private String data;
    private int NumEquipSalvavidas;
    private int EsloraDef;
    private int VolumAgua;
    private int Tripulantes;




    public String getBandeira() {
        return Bandeira;
    }

    public void setBandeira(String bandeira) {
        Bandeira = bandeira;
    }

    public int getEsloraDef() {
        return EsloraDef;
    }

    public void setEsloraDef(int esloraDef) {
        EsloraDef = esloraDef;
    }

    public int getVolumAgua() {
        return VolumAgua;
    }

    public void setVolumAgua(int volumAgua) {
        VolumAgua = volumAgua;
    }

    public int getTripulantes() {
        return Tripulantes;
    }

    public void setTripulantes(int tripulantes) {
        Tripulantes = tripulantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = String.valueOf(matricula);
    }

    public int getNumLicencia() {
        return NumLicencia;
    }

    public void setNumLicencia(int numLicencia) {
        NumLicencia = numLicencia;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getNumEquipSalvavidas() {
        return NumEquipSalvavidas;
    }

    public void setNumEquipSalvavidas(int numEquipSalvavidas) {
        NumEquipSalvavidas = numEquipSalvavidas;
    }

    public Contenedores(int TransporteMerc, int LiñasRegViaj) {
        super(TransporteMerc, LiñasRegViaj);
    }
}

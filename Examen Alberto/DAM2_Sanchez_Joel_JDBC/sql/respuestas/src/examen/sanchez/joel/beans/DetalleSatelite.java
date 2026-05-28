package examen.sanchez.joel.beans;

public class DetalleSatelite {

    private String idDetalle;
    private int velocidadMaxima;
    private int combustible;
    private int vidaUtil;
    private int temperaturaMaxima;
    private String idSatelite;
    private String sanchezJoel;

    // Constructor vacío (obligatorio para rs.next())
    public DetalleSatelite() {}

    // Constructor sin id (para INSERT, el id lo asigna la BD)
        public DetalleSatelite(int velocidadMaxima, int combustible, int vidaUtil, int temperaturaMaxima, String idSatelite,
            String sanchezJoel) {
        this.velocidadMaxima = velocidadMaxima;
        this.combustible = combustible;
        this.vidaUtil = vidaUtil;
        this.temperaturaMaxima = temperaturaMaxima;
        this.idSatelite = idSatelite;
        this.sanchezJoel = sanchezJoel;
    }

    public String getIdDetalle() {
        return idDetalle;}
    public void setIdDetalle(String idDetalle) {
        this.idDetalle = idDetalle;}
    public int getVelocidadMaxima() {
        return velocidadMaxima;}
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;}
    public int getCombustible() {
        return combustible;}
    public void setCombustible(int combustible) {
        this.combustible = combustible;}
    public int getVidaUtil() {
        return vidaUtil;}
    public void setVidaUtil(int vidaUtil) {
        this.vidaUtil = vidaUtil;}
    public int getTemperaturaMaxima() {
        return temperaturaMaxima;}
    public void setTemperaturaMaxima(int temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;}
    public String getIdSatelite() {
        return idSatelite;}
    public void setIdSatelite(String idSatelite) {
        this.idSatelite = idSatelite;}
    public String getSanchezJoel() {
        return sanchezJoel;}
    public void setSanchezJoel(String sanchezJoel) {
        this.sanchezJoel = sanchezJoel;}

    @Override
    public String toString() {
        return "DetalleSatelite [idDetalle=" + idDetalle + ", velocidadMaxima=" + velocidadMaxima + ", combustible="
                + combustible + ", vidaUtil=" + vidaUtil + ", temperaturaMaxima=" + temperaturaMaxima + ", idSatelite="
                + idSatelite + ", sanchezJoel=" + sanchezJoel + "]";
    }

    
}



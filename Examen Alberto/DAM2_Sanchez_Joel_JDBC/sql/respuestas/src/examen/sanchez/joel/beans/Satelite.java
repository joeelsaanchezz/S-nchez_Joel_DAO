package examen.sanchez.joel.beans;

public class Satelite {

    private String idSatelite;
    private String nombre;
    private String orbita;
    private int peso;
    private int coste;
    private String activo;
    private String fechaLanzamiento;
    private String idAgencia;
    private DetalleSatelite detalleSatelite;
    private String sanchezJoel;

    // Constructor vacío (obligatorio para rs.next())
    public Satelite() {}

    // Constructor sin id (para INSERT, el id lo asigna la BD)


    public void setIdAgencia(String idAgencia) {
        this.idAgencia = idAgencia;}
    public Satelite(String nombre, String orbita, int peso, int coste, String activo, String fechaLanzamiento,
            String idAgencia, DetalleSatelite detalleSatelite, String sanchezJoel) {
        this.nombre = nombre;
        this.orbita = orbita;
        this.peso = peso;
        this.coste = coste;
        this.activo = activo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.idAgencia = idAgencia;
        this.detalleSatelite = detalleSatelite;
        this.sanchezJoel = sanchezJoel;
    }

    

    public String getIdSatelite() {
        return idSatelite;}
    public void setIdSatelite(String idSatelite) {
        this.idSatelite = idSatelite;}
    public String getNombre() {
        return nombre;}
    public void setNombre(String nombre) {
        this.nombre = nombre;}
    public String getOrbita() {
        return orbita;}
    public void setOrbita(String orbita) {
        this.orbita = orbita;}
    public int getPeso() {
        return peso;}
    public void setPeso(int peso) {
        this.peso = peso;}
    public int getCoste() {
        return coste;}
    public void setCoste(int coste) {
        this.coste = coste;}
    public String getActivo() {
        return activo;}
    public void setActivo(String activo) {
        this.activo = activo;}
    public String getFechaLanzamiento() {
        return fechaLanzamiento;}
    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;}
    public String getIdAgencia() {
        return idAgencia;}
    public DetalleSatelite getDetalleSatelite() {
        return detalleSatelite;}
    public void setDetalleSatelite(DetalleSatelite detalleSatelite) {
        this.detalleSatelite = detalleSatelite;}
    public String getSanchezJoel() {
        return sanchezJoel;}
    public void setSanchezJoel(String sanchezJoel) {
        this.sanchezJoel = sanchezJoel;}

    @Override
    public String toString() {
        return "Satelite [idSatelite=" + idSatelite + ", nombre=" + nombre + ", orbita=" + orbita + ", peso=" + peso
                + ", coste=" + coste + ", activo=" + activo + ", fechaLanzamiento=" + fechaLanzamiento + ", idAgencia="
                + idAgencia + ", detalleSatelite=" + detalleSatelite + ", sanchezJoel=" + sanchezJoel + "]";
    }

    
}



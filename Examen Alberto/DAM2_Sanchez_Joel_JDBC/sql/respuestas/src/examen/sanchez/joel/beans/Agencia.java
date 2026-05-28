package examen.sanchez.joel.beans;

public class Agencia {

    private String idAgencia;
    private String nombre;
    private String pais;
    private String fechaFundacion;
    private String sanchezJoel;

    // Constructor vacío (obligatorio para rs.next())
    public Agencia() {}

    // Constructor sin id (para INSERT, el id lo asigna la BD)
    public Agencia(String nombre, String pais, String fechaFundacion, String sanchezJoel) {
        this.nombre = nombre;
        this.pais = pais;
        this.fechaFundacion = fechaFundacion;
        this.sanchezJoel = sanchezJoel;
    }

    public String getIdAgencia() {
        return idAgencia;}
    public void setIdAgencia(String idAgencia) {
        this.idAgencia = idAgencia;}
    public String getNombre() {
        return nombre;}
    public void setNombre(String nombre) {
        this.nombre = nombre;}
    public String getPais() {
        return pais;}
    public void setPais(String pais) {
        this.pais = pais;}
    public String getFechaFundacion() {
        return fechaFundacion;}
    public void setFechaFundacion(String fechaFundacion) {
        this.fechaFundacion = fechaFundacion;}
    public String getSanchezJoel() {
        return sanchezJoel;}
    public void setSanchezJoel(String sanchezJoel) {
        this.sanchezJoel = sanchezJoel;}

    @Override
    public String toString() {
        return "Agencia [idAgencia=" + idAgencia + ", nombre=" + nombre + ", pais=" + pais + ", fechaFundacion="
                + fechaFundacion + ", sanchezJoel=" + sanchezJoel + "]";
    }
}



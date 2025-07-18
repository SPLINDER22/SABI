package Modelo;

import java.time.LocalDate;

/**
 *
 * @author Rojas
 */
public class Suscripcion {

    int idSuscripcion;
    int fkIdEntrenador;
    int fkIdCliente;
    LocalDate inicioSuscripcion;
    LocalDate finSuscripcion;
    String estadoSuscripcion;
    int renovaciones;
    int valorSuscripcion;
    String estadoPagoSuscripcion;
    Usuario entrenador;
    int reporte;

    public Suscripcion() {
    }

    public Suscripcion(int idSuscripcion, int fkIdEntrenador, int fkIdCliente, LocalDate inicioSuscripcion, LocalDate finSuscripcion, String estadoSuscripcion, int renovaciones, int valorSuscripcion, String estadoPagoSuscripcion, int reporte) {
        this.idSuscripcion = idSuscripcion;
        this.fkIdEntrenador = fkIdEntrenador;
        this.fkIdCliente = fkIdCliente;
        this.inicioSuscripcion = inicioSuscripcion;
        this.finSuscripcion = finSuscripcion;
        this.estadoSuscripcion = estadoSuscripcion;
        this.renovaciones = renovaciones;
        this.valorSuscripcion = valorSuscripcion;
        this.estadoPagoSuscripcion = estadoPagoSuscripcion;
        this.reporte = reporte;
    }

    public Usuario getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Usuario entrenador) {
        this.entrenador = entrenador;
    }


    public int getIdSuscripcion() {
        return idSuscripcion;
    }

    public int getFkIdEntrenador() {
        return fkIdEntrenador;
    }

    public int getFkIdCliente() {
        return fkIdCliente;
    }

    public LocalDate getInicioSuscripcion() {
        return inicioSuscripcion;
    }

    public LocalDate getFinSuscripcion() {
        return finSuscripcion;
    }

    public String getEstadoSuscripcion() {
        return estadoSuscripcion;
    }

    public int getRenovaciones() {
        return renovaciones;
    }

    public float getValorSuscripcion() {
        return valorSuscripcion;
    }
    
    public String getEstadoPagoSuscripcion() {
        return estadoPagoSuscripcion;
    }

    public int getReporte() {
        return reporte;
    }
    
 
    public void setIdSuscripcion(int idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    public void setFkIdEntrenador(int fkIdEntrenador) {
        this.fkIdEntrenador = fkIdEntrenador;
    }

    public void setFkIdCliente(int fkIdCliente) {
        this.fkIdCliente = fkIdCliente;
    }

    public void setInicioSuscripcion(LocalDate inicioSuscripcion) {
        this.inicioSuscripcion = inicioSuscripcion;
    }

    public void setFinSuscripcion(LocalDate finSuscripcion) {
        this.finSuscripcion = finSuscripcion;
    }

    public void setEstadoSuscripcion(String estadoSuscripcion) {
        this.estadoSuscripcion = estadoSuscripcion;
    }

    public void setRenovaciones(int renovaciones) {
        this.renovaciones = renovaciones;
    }

    public void setValorSuscripcion(int valorSuscripcion) {
        this.valorSuscripcion = valorSuscripcion;
    }
    
    public void setEstadoPagoSuscripcion(String estadoPagoSuscripcion) {
        this.estadoPagoSuscripcion = estadoPagoSuscripcion;
    }

    public void setReporte(int reporte) {
        this.reporte = reporte;
    }
    

    @Override
    public String toString() {
        return "Suscripcion{" + "idSuscripcion=" + idSuscripcion + ", fkIdEntrenador=" + fkIdEntrenador + ", fkIdCliente=" + fkIdCliente + ", inicioSuscripcion=" + inicioSuscripcion + ", finSuscripcion=" + finSuscripcion + ", estadoSuscripcion=" + estadoSuscripcion + ", renovaciones=" + renovaciones + ", valorSuscripcion=" + valorSuscripcion + ", estadoPagoSuscripcion=" + estadoPagoSuscripcion + ",reporte" + reporte +'}';
    }
}

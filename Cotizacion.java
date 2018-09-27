/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

/**
 *
 * @author EVADAFDIL
 */
public class Cotizacion {
    private int numCotizacion;
    private String descripcion;
    private double precio;
    private double porcentajePagoInicial;
    private int plazo;
    
    public Cotizacion(){
        this.numCotizacion = 123;
        this.descripcion = "Yaris SX";
        this.precio = 220000.00;
        this.porcentajePagoInicial = 0.25;
        this.plazo = 36;
    }

    public Cotizacion(int nc, String d, double p, double ppi, int m){
        this.numCotizacion = nc;
        this.descripcion = d;
        this.precio = p;
        this.porcentajePagoInicial = ppi;
        this.plazo = m;
    }    
    
    public Cotizacion(Cotizacion otro){
        this.numCotizacion = otro.numCotizacion;
        this.descripcion = otro.descripcion;
        this.precio = otro.precio;
        this.porcentajePagoInicial = otro.porcentajePagoInicial;
        this.plazo = otro.plazo;
    }    

    /**
     * @return the numCotizacion
     */
    public int getNumCotizacion() {
        return numCotizacion;
    }

    /**
     * @param numCotizacion the numCotizacion to set
     */
    public void setNumCotizacion(int numCotizacion) {
        this.numCotizacion = numCotizacion;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the porcentajePagoInicial
     */
    public double getPorcentajePagoInicial() {
        return porcentajePagoInicial;
    }

    /**
     * @param porcentajePagoInicial the porcentajePagoInicial to set
     */
    public void setPorcentajePagoInicial(double porcentajePagoInicial) {
        this.porcentajePagoInicial = porcentajePagoInicial;
    }

    /**
     * @return the plazo
     */
    public int getPlazo() {
        return plazo;
    }

    /**
     * @param plazo the plazo to set
     */
    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
    
    public double calcularPagoInicial()
    {
        double pagoInicial;
        pagoInicial = precio*(porcentajePagoInicial/100);
        return pagoInicial;
    }
    
    public double calcularTotalFinanciar()
    {
        double totalFinanciar;
        totalFinanciar = precio - this.calcularPagoInicial();
        return totalFinanciar;
    }
    
    public double calcularPagoMensual()
    {
        double pagoMensual;
        pagoMensual = this.calcularTotalFinanciar() / plazo;
        return pagoMensual;
    }
}

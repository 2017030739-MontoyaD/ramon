/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

/**
 *
 * @author software 9
 */
public class Boleto {
    private int numeroBoleto;
    private String nombreCliente;
    private float precio;
    private int tipoBoleto;
    private String fecha;
    private String destino;
    
    public Boleto(){ //Constructor por omisión
        this.numeroBoleto=123;
        this.nombreCliente="José López";
        this.precio=950.00F;
        this.tipoBoleto=1;
        this.fecha="04/10/2017";
        this.destino="Hermosillo, Sonora";
    }

    public Boleto(int nb, String nc, float p, int tp, String f, String d){ //Constructor con argumentos
        this.numeroBoleto=nb;
        this.nombreCliente=nc;
        this.precio=p;
        this.tipoBoleto=tp;
        this.fecha=f;
        this.destino=d;
    }

    public Boleto(Boleto otro){ //Constructor copia
        this.numeroBoleto = otro.numeroBoleto;
        this.nombreCliente = otro.nombreCliente;
        this.precio = otro.precio;
        this.tipoBoleto = otro.tipoBoleto;
        this.fecha = otro.fecha;
        this.destino = otro.destino;
    }

    /**
     * @return the numeroBoleto
     */
    public int getNumeroBoleto() {
        return numeroBoleto;
    }

    /**
     * @param numeroBoleto the numeroBoleto to set
     */
    public void setNumeroBoleto(int numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }

    /**
     * @return the nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * @param nombreCliente the nombreCliente to set
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the tipoBoleto
     */
    public int getTipoBoleto() {
        return tipoBoleto;
    }

    /**
     * @param tipoBoleto the tipoBoleto to set
     */
    public void setTipoBoleto(int tipoBoleto) {
        this.tipoBoleto = tipoBoleto;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    public float calcularSubtotal()
    {
        float subtotal=0;
        
        if(tipoBoleto==1)
            subtotal=precio;
        else if(tipoBoleto==2)
            subtotal = (float) (precio+(precio*0.8));
        
        return subtotal;
    }
    
    public float calcularImpuesto()
    {
        float sub, impuesto;
        
        sub = calcularSubtotal();
        impuesto = (float) (sub*0.16);
        
        return impuesto;
    }
    
    public float calcularDescuento(int edad)
    {
        float descuento=0, sub;
        
        sub = calcularSubtotal();
        if(edad>60)
        {
            descuento = sub/2;
        }
        
        return descuento;
    }
    
}
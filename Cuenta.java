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
public class Cuenta {
    private String nombreCliente;
    private String domicilioCliente;
    private String fechaNacimiento;
    private int numeroCuenta;
    private double saldo;
    private String fechaApertura;
    private String nombreSucursal;
    
    public Cuenta()
    {
        this.nombreCliente="";
        this.domicilioCliente="";
        this.fechaNacimiento="";
        this.numeroCuenta=123456;
        this.saldo=0;
        this.fechaApertura="26/09/2018";
        this.nombreSucursal="Mazatlán";
    }
    
    public Cuenta(String nom, String dc, String fn, int nc, double s, String fa, String ns)
    {
        this.nombreCliente=nom;
        this.domicilioCliente=dc;
        this.fechaNacimiento=fn;
        this.numeroCuenta=nc;
        this.saldo=s;
        this.fechaApertura=fa;
        this.nombreSucursal=ns;
    }
    
    public Cuenta(Cuenta otro)
    {
        this.nombreCliente=otro.nombreCliente;
        this.domicilioCliente=otro.domicilioCliente;
        this.fechaNacimiento=otro.fechaNacimiento;
        this.numeroCuenta=otro.numeroCuenta;
        this.saldo=otro.saldo;
        this.fechaApertura=otro.fechaApertura;
        this.nombreSucursal=otro.nombreSucursal;
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
     * @return the domicilioCliente
     */
    public String getDomicilioCliente() {
        return domicilioCliente;
    }

    /**
     * @param domicilioCliente the domicilioCliente to set
     */
    public void setDomicilioCliente(String domicilioCliente) {
        this.domicilioCliente = domicilioCliente;
    }

    /**
     * @return the fechaNacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the numeroCuenta
     */
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * @param numeroCuenta the numeroCuenta to set
     */
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the fechaApertura
     */
    public String getFechaApertura() {
        return fechaApertura;
    }

    /**
     * @param fechaApertura the fechaApertura to set
     */
    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    /**
     * @return the nombreSucursal
     */
    public String getNombreSucursal() {
        return nombreSucursal;
    }

    /**
     * @param nombreSucursal the nombreSucursal to set
     */
    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }
    
    public void realizarApertura(double saldoInicial)
    {
        saldo = saldoInicial;
    }
    
    public void retirar(double cantidadRetirar)
    {
        saldo = saldo - cantidadRetirar;
    }
    
    public void depositar(double cantidadDepositar)
    {
        saldo = saldo + cantidadDepositar;
    }
    
    public double consultarSaldo()
    {
        return saldo;
    }
}

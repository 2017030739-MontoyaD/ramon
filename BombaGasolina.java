/*
 * Examen I Unidad.
 */
package bombagasolina;

/**
 *
 * @author Montoya Herrera Dilian Dafne     INF 4-4
 */
public class BombaGasolina {
    private int numBomba;
    private int tipoGasolina;
    private int precio;
    private int capacidadLitros;
    private int litrosVendidos;
    
    public BombaGasolina(){
        numBomba = 1;
        tipoGasolina = 1;
        precio = 15;
        capacidadLitros = 1000;
        litrosVendidos = 0;
    }
    
    public BombaGasolina(int numBomb, int tipoGas, int p, int capacidadLit, int litVend){
        numBomba = numBomb;
        tipoGasolina = tipoGas;
        precio = p;
        capacidadLitros = capacidadLit;
        litrosVendidos = litVend;        
    }
    
    public BombaGasolina(BombaGasolina otro){
        numBomba = otro.numBomba;
        tipoGasolina = otro.tipoGasolina;
        precio = otro.precio;
        capacidadLitros = otro.capacidadLitros;
        litrosVendidos = otro.litrosVendidos;        
    }

    /**
     * @return the numBomba
     */
    public int getNumBomba() {
        return numBomba;
    }

    /**
     * @param numBomba the numBomba to set
     */
    public void setNumBomba(int numBomba) {
        this.numBomba = numBomba;
    }

    /**
     * @return the tipoGasolina
     */
    public int getTipoGasolina() {
        return tipoGasolina;
    }

    /**
     * @param tipoGasolina the tipoGasolina to set
     */
    public void setTipoGasolina(int tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the capacidadLitros
     */
    public int getCapacidadLitros() {
        return capacidadLitros;
    }

    /**
     * @param capacidadLitros the capacidadLitros to set
     */
    public void setCapacidadLitros(int capacidadLitros) {
        this.capacidadLitros = capacidadLitros;
    }

    /**
     * @return the litrosVendidos
     */
    public int getLitrosVendidos() {
        return litrosVendidos;
    }

    /**
     * @param litrosVendidos the litrosVendidos to set
     */
    public void setLitrosVendidos(int litrosVendidos) {
        this.litrosVendidos = litrosVendidos;
    }
    
    public void iniciarBomba()
    {        
        litrosVendidos = 0;
    }
    
    public int verificarInventario()
    {
        int cantDisponible;
        cantDisponible = capacidadLitros - litrosVendidos;        
        return cantDisponible;
    }
    
    public int realizarVenta(int ventaNumLitros)
    {
        int costoVenta;
        costoVenta = ventaNumLitros * precio;
        litrosVendidos += ventaNumLitros;
        return costoVenta;
    }
    
    public int calcularVentaTotal()
    {
        int ventaTotal;
        ventaTotal = litrosVendidos * precio;
        return ventaTotal;
    }
}

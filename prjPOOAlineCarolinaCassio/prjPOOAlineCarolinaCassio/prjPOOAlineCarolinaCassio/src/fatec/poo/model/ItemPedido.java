
package fatec.poo.model;

/**
 * @author Aline Herculano
 * @author Carolina Santiago
 * @author Cassio Hiroshi
 */

public class ItemPedido {
    
    private int sequencia;
    private double qtdeVendida;
    
    public ItemPedido(int sequencia, double qtdeVendida, Produto produto) {
        this.sequencia = sequencia;
        this.qtdeVendida = qtdeVendida;
    }

    public void setQtdeVendida(double qtdeVendida) {
        this.qtdeVendida = qtdeVendida;
    }

    public int getSequencia() {
        return sequencia;
    }

    public double getQtdeVendida() {
        return qtdeVendida;
    }
   
}



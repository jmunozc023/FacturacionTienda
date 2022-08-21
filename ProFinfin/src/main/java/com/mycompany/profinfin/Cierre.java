package com.mycompany.profinfin;

public class Cierre {

   
    private String cliente;
    private String totalCompra;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(String totalCompra) {
        this.totalCompra = totalCompra;
    }
    
     public Cierre(String cliente, String totalCompra) {
        this.cliente = cliente;
        this.totalCompra = totalCompra;
    }
    
}

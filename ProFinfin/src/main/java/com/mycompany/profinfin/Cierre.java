package com.mycompany.profinfin;

public class Cierre {

   
    private String cliente;
    private String numtel;
    private String email;

    
    private double totalCompra;
    public String getNumtel() {
        return numtel;
    }

    public void setNumtel(String numtel) {
        this.numtel = numtel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }
    
     public Cierre(String cliente, String numtel, String email, double totalCompra) {
        this.cliente = cliente;
        this.numtel = numtel;
        this.email = email;
        this.totalCompra = totalCompra;
    }
    
}

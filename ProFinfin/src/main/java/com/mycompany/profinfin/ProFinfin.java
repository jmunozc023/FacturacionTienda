package com.mycompany.profinfin;

import java.util.ArrayList;

public class ProFinfin {
    public static ArrayList<Cliente> cl;
    public static ArrayList<Articulos> inv;
    public static ArrayList<Factura> fac;

    public static void main(String[] args) {
         cl =new ArrayList<>();
        inv =new ArrayList<>();
        fac =new ArrayList<>();
        interfazCliente infaCli = new interfazCliente();
        infaCli.clientesBase();
        interfazInventario infaInv = new interfazInventario();
        infaInv.inventarioBase();
        interfazFacturacion infafac = new interfazFacturacion();
        MenuGUI principal =new MenuGUI ();
        principal.setVisible(true);
    }
}

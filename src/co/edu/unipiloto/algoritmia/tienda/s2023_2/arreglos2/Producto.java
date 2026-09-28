/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.algoritmia2023_2.tienda.arreglos;

/**
 *
 * @author SG702-21
 */
public class Producto {

    //Constantes
    public static final int SUPERMERCADO = 1;
    public static final int PAPELERIA = 2;
    public static final int DROGUERIA = 3;
    public static final int ROPA = 4;
    //Constantes IVA

    public static final double IVA_PAPEL = 0.16;
    public static final double IVA_MERCADO = 0.04;
    public static final double IVA_FARMACIA = 0.12;
    public static final double IVA_ROPA = 0.20;

    //Declarar atributos de la clase
    private String nombre;
    private int tipo;
    private double valorUnitario;
    private int cantidadBodega;
    private int cantidadMinima;
    private int totalProductosVendidos;

    //Declarar los constructores
    //Constructor vacio
    public Producto() {

    }

    //Constructor con todos los atributos
    public Producto(String nombre, int tipo, double valorUnitario,
            int cantidadBodega, int cantidadMinima, int totalProductosVendidos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.valorUnitario = valorUnitario;
        this.cantidadBodega = cantidadBodega;
        this.cantidadMinima = cantidadMinima;
        this.totalProductosVendidos = totalProductosVendidos;
    }
    //Get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getCantidadBodega() {
        return cantidadBodega;
    }

    public void setCantidadBodega(int cantidadBodega) {
        this.cantidadBodega = cantidadBodega;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    public int getTotalProductosVendidos() {
        return totalProductosVendidos;
    }

    public void setTotalProductosVendidos(int totalProductosVendidos) {
        this.totalProductosVendidos = totalProductosVendidos;
    }

    //to string
    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", tipo=" + darTipoNombre() + ", valorUnitario=" + valorUnitario + ", cantidadBodega=" + cantidadBodega + ", cantidadMinima=" + cantidadMinima + ", totalProductosVendidos=" + totalProductosVendidos + '}';
    }

    ///Metodo de negocio
    public int venderProducto(int cantidad) {
        int cantidadReal;
        if (cantidad > this.cantidadBodega) {
            //Solamente vender la cantidad disponible en bodega
            cantidadReal = this.cantidadBodega;
            this.totalProductosVendidos = this.totalProductosVendidos + this.cantidadBodega;
            this.cantidadBodega = 0;

        } else {
            //Tenemos suficientes productos para atender la cantidad solicitada
            cantidadReal = cantidad;
            this.totalProductosVendidos = this.totalProductosVendidos + cantidad;
            this.cantidadBodega = this.cantidadBodega - cantidad;
        }
        return cantidadReal;
    }

    //Metodo para decidir si el producto es de DROGUERIA
    public boolean esProductoDrogueria() {
        if (this.tipo == Producto.DROGUERIA) {
            return true;
        } else {
            return false;
        }
    }

    //Metodo para decidir si el producto esta valorizado en mas de 100000
    public boolean estaValorizado(int valor) {
        if ((this.valorUnitario * this.cantidadBodega) >= valor) {
            return true;
        } else {
            return false;
        }
    }

    /*
    Método subirValorUnitario
    – Aumentar el valor unitario del producto, utilizando la siguiente 
    política:
    
    
    • Si el producto cuesta menos de $1000, aumentar el 1%..
    • Si cuesta entre $1000 y $5000, aumentar el 2%.
    • Si cuesta más de $5000 aumentar el 3%
     */
    public double subirValorUnitario() {
        //Si el producto cuesta menos de $1000, aumentar el 1%. 
        if (this.valorUnitario < 1000) {
            this.valorUnitario = this.valorUnitario * (1 + 0.01);
        } else {
            //Si cuesta entre $1000 y $5000, aumentar el 2%.
            if (this.valorUnitario >= 1000 && this.valorUnitario <= 5000) {
                this.valorUnitario = this.valorUnitario * (1 + 0.02);
            } else {
                //Si cuesta más de $5000 aumentar el 3%
                if (this.valorUnitario > 5000) {
                    this.valorUnitario = this.valorUnitario * (1 + 0.03);
                }
            }
        }
        return this.valorUnitario;
    }

    public double darIVA1() {
        if (this.tipo == Producto.PAPELERIA) {
            return Producto.IVA_PAPEL;
        } else if (this.tipo == Producto.SUPERMERCADO) {
            return Producto.IVA_MERCADO;
        } else {
            return Producto.IVA_FARMACIA;
        }

    }

    public double darIVA() {
        double valor = 0.0;
        switch (this.tipo) {
            case Producto.PAPELERIA:
                valor = Producto.IVA_PAPEL;
                break;
            case Producto.SUPERMERCADO:
                valor = Producto.IVA_MERCADO;
                break;
            case Producto.DROGUERIA:
                valor = Producto.IVA_FARMACIA;
                break;
            case Producto.ROPA:
                valor = Producto.IVA_ROPA;
                break;
        }
        return valor;
    }

    //Dar el valor del producto con IVA
    public double darPrecioConIVA() {
              
        return this.valorUnitario*(1+darIVA());
    }
    
    public String darTipoNombre(){
        return " tipo "+tipo;
    }
}

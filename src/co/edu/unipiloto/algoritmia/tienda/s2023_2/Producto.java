/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.algoritmia.tienda.s2023_2;

import co.edu.unipiloto.algoritmia.tienda.*;

/**
 *
 * @author SG701-21
 */
public class Producto {

    //Constantes
    public final static int PAPELERIA = 1;
    public final static int SUPERMERCADO = 2;
    public final static int DROGUERIA = 3;

    //Constantes para el IVA
    public final static double IVA_PAPEL = 0.16;
    public final static double IVA_MERCADO = 0.04;
    public final static double IVA_FARMACIA = 0.12;

    //Atributos
    private String nombre;
    private int tipo;
    private int cantidadBodega;
    private int cantidadMinima;
    private double valorUnitario;
    private int totalProductosVendidos;

    //Declarar constructores
    public Producto() {
    }

    public Producto(String nombre, int tipo, int cantidadBodega, int cantidadMinima, double valorUnitario, int totalProductosVendidos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidadBodega = cantidadBodega;
        this.cantidadMinima = cantidadMinima;
        this.valorUnitario = valorUnitario;
        this.totalProductosVendidos = totalProductosVendidos;
    }

    //Metodos get y set 
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

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getTotalProductosVendidos() {
        return totalProductosVendidos;
    }

    public void setTotalProductosVendidos(int totalProductosVendidos) {
        this.totalProductosVendidos = totalProductosVendidos;
    }

    //Visualizar los contenidos de los objetos Producto to string
    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", tipo=" + tipo + ", cantidadBodega=" + cantidadBodega + ", cantidadMinima=" + cantidadMinima + ", valorUnitario=" + valorUnitario + ", totalProductosVendidos=" + totalProductosVendidos + '}';
    }

    //Metodos de negocio para evaluar las expresiones
    ///Metodo de negocio
    public int venderProducto(int cantidad) {
        int cantidadReal = 0;
        if (cantidad > this.cantidadBodega) {
            //Solamente vender la cantidad disponible en bodega
            cantidadReal = this.cantidadBodega;
            //Actualizar el total de productos de vendidos
            this.totalProductosVendidos += cantidadReal;
            //Se agotaron los productos
            this.cantidadBodega = 0;

        } else { //cantidad <= cantidad disponible en bodega
            //Tenemos suficientes productos para atender la cantidad solicitada
            cantidadReal = cantidad;
            //Actualizar el total de productos de vendidos
            this.totalProductosVendidos += cantidadReal;
            //Actualizar la cantidad disponible en bodega
            this.cantidadBodega -= cantidadReal;
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

    //Metodo para decidir si el producto esta valorizado en mas de un cierto valor
    public boolean estaValorizado(int valor) {
        if ((this.valorUnitario * this.cantidadBodega) >= valor) {
            return true;
        } else {
            return false;
        }
    }

    /*
     double IVA_PAPEL=0.16;
    double IVA_MERCADO=0.04;
     double IVA_FARMACIA=0.12;
     */
    //Crear un metodo para indicar el IVA del producto actual
    public double getIVA() {
        if (this.tipo == Producto.PAPELERIA) {
            return Producto.IVA_PAPEL;
        } else {
            if (this.tipo == Producto.SUPERMERCADO) {
                return Producto.IVA_MERCADO;
            } else {
                return Producto.IVA_FARMACIA;
            }
        }
    }

    // Crear un metodo para calcular el valor unitario con IVA de cualquier producto
    
    public double valorUnitarioConIVA() {
        return this.valorUnitario*(1+getIVA());
}
    
    public double valorUnitarioConIVA_ex() {
        if (this.tipo == Producto.PAPELERIA) {
            return this.valorUnitario * (1 + Producto.IVA_PAPEL);
        } else {
            if (this.tipo == Producto.SUPERMERCADO) {
                return this.valorUnitario * (1 + Producto.IVA_MERCADO);
            }
            else
                return this.valorUnitario * (1 + Producto.IVA_FARMACIA);
        }
    }
    }

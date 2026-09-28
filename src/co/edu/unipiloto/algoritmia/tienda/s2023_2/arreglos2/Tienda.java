/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.algoritmia2023_2.tienda.arreglos;

import java.util.Scanner;

/**
 *
 * @author SG702-21
 */
public class Tienda {
    //Atributos

    private String nombre;
    private Producto[] productos;
    private int actual = 0;
    private int maximo = 0;

    //Constructores 
    //Constructor por defecto
    public Tienda() {
        //Instanciar el arreglos de actual posiciones
        productos = new Producto[maximo];
        // Instanciar cada Producto en la posición iesima
        for (int i = 0; i < maximo; i++) {
            productos[i] = new Producto();
        }
        actual=0;
    }

    //Constructor con todos los atributos
    public Tienda(String nombre, int max) {
        this.nombre = nombre;
        this.maximo = max;
        productos = new Producto[max];
        for (int i = 0; i < max; i++) {
            productos[i] = new Producto();
        }
        actual=0;
    }

    public Tienda(String nombre, Producto[] productos, int max, int actual) {
        this.nombre = nombre;
        this.productos = productos;
        this.maximo = max;
        this.actual = actual;
    }

    //Metodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }
    
    

    //To string
    @Override
    public String toString() {
        String stringTienda = "";
        stringTienda = "Tienda{" + "nombre=" + nombre + ",";
        for (int i = 0; i < actual; i++) {
            stringTienda = stringTienda + "\n producto " + i + " " + productos[i].toString() + "";
        }
        stringTienda = stringTienda + "}";
        return stringTienda;
    }

    //Metodos de negocio
    
    
    
    //Agregar nuevo producto a la tienda
    public void adicionarProducto(Producto prod) {
        if (actual < this.maximo) {
            this.productos[actual] = prod;
            this.actual++;
        } 
        else {
            System.out.println("No se pueden adicionar mas productos Maximo "+this.maximo);
        }
    }

    // Indicar el producto de la tienda menos vendido
    public String productoMenosVendido() {
        //Cuantas unidasdes se han vendido del producto 1
        //unidades de prod1>prod2 y prod1>prod3 y prod1>prod4
        String candidato = "";
        int cantidadCandidato = productos[0].getTotalProductosVendidos();
        for (int i = 0; i < actual; i++) {
            if (productos[i].getTotalProductosVendidos() < cantidadCandidato) {
                cantidadCandidato = productos[i].getTotalProductosVendidos();
                candidato = productos[i].getNombre();
            }
        }
        return candidato;
    }

    //Indicar el nombre del producto mas vendido
    public String productoMasVendido() {
        //Cuantas unidasdes se han vendido del producto 1
        //unidades de prod1>prod2 y prod1>prod3 y prod1>prod4
        String candidato = "";
        int cantidadCandidato = 0;
        for (int i = 0; i < actual; i++) {
            if (productos[i].getTotalProductosVendidos() > cantidadCandidato) {
                cantidadCandidato = productos[i].getTotalProductosVendidos();
                candidato = productos[i].getNombre();
            }
        }
        return candidato;
    }

    //Metodo para calcular las ventas totales de la tienda sin IVA
    public double ventasTotales() {
        double acumulador = 0.0;
        for (int i = 0; i < actual; i++) {
            acumulador += productos[i].getValorUnitario() * productos[i].getTotalProductosVendidos();
        }
        return acumulador;
    }

    //Calcular ventas totales con IVA
    public double ventasTotalesConIVA() {
        double acumulador = 0.0;
        for (int i = 0; i < actual; i++) {
            acumulador += (productos[i].getTotalProductosVendidos() * productos[i].getValorUnitario())
                    * (1 + productos[i].darIVA());
        }
        return acumulador;
    }
    //Metodo para calcular el IVA a pagar tomando en cuenta las ventas totales

    public double IVAaPagar() {
        return ventasTotalesConIVA() - ventasTotales();
    }

    //Calcular el precio promedio de los productos de la tienda
    public double darPrecioPromedio() {
        double acumulador = 0.0;
        for (int i = 0; i < actual; i++) {
            acumulador += productos[i].getValorUnitario();
        }
        return acumulador / actual;
    }

    //Mostrar el valor de cada producto con IVA
    public void mostrarListaPrecios() {
        for (int i = 0; i < actual; i++) {
            System.out.println("Producto " + productos[i].getNombre() + " Precio con iva: " + productos[i].darPrecioConIVA());
        }
    }
    
    //Vender productos 
    //Recibe el nombre producto
    //La cantidad solicitada
    //Si no hay suficientes se hace la venta parcial
    public int venderProducto(String nombreProd, int cantProd){
        int cantidadReal=0;
        boolean encontro=false;
        //buscar el producto
        //Patron de busqueda en arreglos
        for (int i = 0; (i< this.actual && !encontro); i++){
            if ( productos [i].getNombre().equals(nombreProd)){
                 cantidadReal = productos [i].venderProducto(cantProd);
                 encontro=true;
            }
        }
        return cantidadReal;
    }

    //Metodo para mostrar los primeros 100 numeros desde 1
    public void mostrarRangoNumeros(int valorInferior, int valorSuperior) {
        for (int i = valorInferior; i <= valorSuperior; i++) {
            System.out.println("Numero " + i);
        }
    }

    //Metodo para sumar un rango  de numeros
    public int sumaRangoNumeros(int valorInferior, int valorSuperior) {
        //Declarar una variable acumuladora
        int acumulador = 0;
        for (int i = valorInferior; i <= valorSuperior; i++) {
            acumulador += i;
        }
        return acumulador;
    }
    //Metodo para contar un rango  de numeros

    public int contarRangoNumeros(int valorInferior, int valorSuperior) {
        //Declarar una variable acumuladora
        int contador = 0;
        for (int i = valorInferior; i <= valorSuperior; i++) {
            contador++;
        }
        return contador;
    }

    //Metodo para calcular la funcion factorial
    public double factorial(int valor) {
        double resultado = 1;
        for (long i = 1; i <= valor; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }

    //factorial version recursiva
    public long factorial1(long valor) {
        if (valor == 0) {
            return 1;
        }
        if (valor == 1) {
            return 1;
        }
        return factorial1(valor - 1) * valor;
    }

    //metodo para leer número indefinidamente y se detiene cuando le pasan 0
    public void leerNumeros() {
        Scanner scan = new Scanner(System.in);
        int valor = 0;
        do {
            System.out.println("Escriba un valor ");
            valor = scan.nextInt();
        } while (valor != 0);
    }

}

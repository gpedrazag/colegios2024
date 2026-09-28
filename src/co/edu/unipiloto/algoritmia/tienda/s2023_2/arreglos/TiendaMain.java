/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.algoritmia.tienda.s2023_2.arreglos;

import java.util.Scanner;


/**
 *
 * @author SG702-21
 */
public class TiendaMain {

    /**
     * @param args the command line arguments
     */
    
    //Declarcacion atributos 
    private static Tienda miTienda;
    
    public static void mostrarMenu(){
        System.out.println("********LA TIENDA ********");
        System.out.println("1. Crear una tienda ");
        System.out.println("2. Agregar producto a la tienda ");
        System.out.println("3. Mostrar productos de la tienda ");
        System.out.println("4. Producto más vendido en la tienda ");
        System.out.println("5. Producto menos vendido en la tienda ");
        System.out.println("6. Valor total de ventas de la tienda");
        System.out.println("7. Valor del IVA a consignar por la tienda");
        System.out.println("8. Precio promedio de los productos ");
        System.out.println("9. Precio con iva de los productos");
        System.out.println("");
        System.out.println("0. Terminar");
        System.out.println("Escriba el numero de la opcion deseada ");
        
    }
    
    public static void crearTienda(){
        Producto libreta=new Producto ("Libreta de apuntes", Producto.PAPELERIA,5500, 23, 15, 87);
        //System.out.println(libreta.toString());
        Producto leche=new Producto("Leche en bolsa de 1 litro ", Producto.SUPERMERCADO,2100,150,30,130);
        //System.out.println(leche.toString());
        Producto jabon=new Producto ("Jabon en polvo",Producto.SUPERMERCADO,4200,15,50,80);
        //System.out.println(jabon.toString());
        Producto aspirina= new Producto( "Aspiran caja de 12 unidades", Producto.DROGUERIA, 2400,60, 100,  80);
        //System.out.println(aspirina.toString());
        //Declarar un arreglo para almacenar los productos
        Producto [] prods= new Producto[4];
        prods[0]=libreta;
        prods[1]=leche;
        prods[2]=jabon;
        prods[3]=aspirina;
                
        miTienda=new Tienda("Mi propia tienda", prods);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int opcion=0;
        do {
            mostrarMenu();
            opcion=scan.nextInt();
            switch (opcion){
                case 1:
                    crearTienda();
                    break;
                case 2:
                    System.out.println("Agregar un producto a la tienda N/A");
                    break;
                case 3:
                    System.out.println(miTienda.toString());
                    break;
                case 4:
                    System.out.println("El producto mas vendido "+miTienda.productoMasVendido());
                    break;
                case 5:
                    System.out.println("El producto menos vendido "+miTienda.productoMenosVendido());
                    break;
                case 6:
                    System.out.println("Las ventas de la tienda ascienden a "+miTienda.ventasTotales());
                    break; 
                case 7:
                    System.out.println("Valor IVA a consignar "+miTienda.IVAaPagar());
                    break;
                case 8:
                    System.out.println("El precio promedio de los productos es "+miTienda.darPrecioPromedio());
                    break;
                case 9:
                    miTienda.mostrarListaPrecios();
            }       
        } while (opcion != 0);
        
        
        /*
        Producto libreta=new Producto();
        libreta.setNombre("Libreta de apuntes");
        libreta.setTipo(Producto.PAPELERIA);
        libreta.setValorUnitario(5500);
        libreta.setCantidadBodega(23);
        libreta.setCantidadMinima(15);
        libreta.setTotalProductosVendidos(87);
        //Mostrar objeto
        System.out.println(libreta.toString());
        */
        Producto libreta=new Producto ("Libreta de apuntes", Producto.PAPELERIA,5500, 23, 15, 87);
        //System.out.println(libreta.toString());
        Producto leche=new Producto("Leche en bolsa de 1 litro ", Producto.SUPERMERCADO,2100,150,30,130);
        //System.out.println(leche.toString());
        Producto jabon=new Producto ("Jabon en polvo",Producto.SUPERMERCADO,4200,15,50,80);
        //System.out.println(jabon.toString());
        Producto aspirina= new Producto( "Aspiran caja de 12 unidades", Producto.DROGUERIA, 2400,60, 100,  80);
        //System.out.println(aspirina.toString());
        //Declarar un arreglo para almacenar los productos
        Producto [] prods= new Producto[4];
        prods[0]=libreta;
        prods[1]=leche;
        prods[2]=jabon;
        prods[3]=aspirina;
                
        Tienda miTienda=new Tienda("Mi propia tienda", prods);
        System.out.println(miTienda.toString());
        
        //System.out.println("El producto menos vendido "+miTienda.productoMenosVendido());
        
        
        /*
        System.out.println("Incremento valor "+libreta.getNombre()+" "+libreta.subirValorUnitario());
        System.out.println("Incremento valor "+leche.getNombre()+" "+leche.subirValorUnitario());
        System.out.println("Incremento valor "+jabon.getNombre()+" "+jabon.subirValorUnitario());
        System.out.println("Incremento valor "+aspirina.getNombre()+" "+aspirina.subirValorUnitario());
        System.out.println(miTienda.toString());
        
        System.out.println("El iva de "+libreta.getNombre()+" es "+libreta.darIVA());
        System.out.println("El iva de "+leche.getNombre()+" es "+leche.darIVA());
        System.out.println("El iva de "+jabon.getNombre()+" es "+jabon.darIVA());
        System.out.println("El iva de "+aspirina.getNombre()+" es "+aspirina.darIVA());
        
        int valor1=1;
        int valor2=10;
        System.out.println(" La suma del rango 1 a 100 es "+miTienda.sumaRangoNumeros(valor1,valor2));
        System.out.println(" La cantidad de numeros del rango 1 a 100 es "+miTienda.contarRangoNumeros(valor1,valor2));
        System.out.println("Factorial de "+valor2+" es "+miTienda.factorial1(valor2));
        miTienda.leerNumeros();
        */
        /*
        //Evaluar expresión
        //tipo== DROGUERIA
        boolean resultado= libreta.getTipo()==Producto.DROGUERIA;
        System.out.println("tipo== DROGUERIA "+resultado);
        
        System.out.println("Evaluacion expresion tipo== DROGUERIA "+libreta.esProductoDrogueria());
        
        //System.out.println("Quiero comprar 10? "+libreta.venderProducto(10));
        System.out.println("Esta valorizado en mas de 100000 "+libreta.estaValorizado(100000));
        
        System.out.println(libreta.toString());
        
        //Crear el segundo producto
        
                //Mostrar objeto
        System.out.println(leche.toString());
        
        System.out.println("Evaluacion expresion tipo== DROGUERIA "+libreta.esProductoDrogueria());
        //
        */
    }
    
}

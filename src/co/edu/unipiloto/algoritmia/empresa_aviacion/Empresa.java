/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.algoritmia.empresa_aviacion;

/**
 *
 * @author sg702-21
 */
public class Empresa {

    //Definir atributos de la Empresa
    private String nombre;
    private String direccion;
    //Una empresa tiene varias rutas
    private Ruta ruta01;
    private Ruta ruta02;
    private Ruta ruta03;
    

    //Declarar metodo constructor
    public Empresa() {
        ruta01=new Ruta();
        ruta02=new Ruta();
        ruta03=new Ruta();
        
    }
    public Empresa(String unNombre, String unaDireccion){
        this.nombre=unNombre;
        this.direccion=unaDireccion;
    }

    public Empresa(Ruta ruta01, Ruta ruta02, Ruta ruta03) {
        this.ruta01 = ruta01;
        this.ruta02 = ruta02;
        this.ruta03 = ruta03;
    }

    
    //Definir los metodos get y set para garantizar encapsulamiento y ocultamiento de informacion
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String newNombre) {
        this.nombre = newNombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void crearRuta(int identificador, String origen, String destino) {

    }
    
    //Get y set para las rutas

    public Ruta getRuta01() {
        return ruta01;
    }

    public void setRuta01(Ruta ruta01) {
        this.ruta01 = ruta01;
    }

    public Ruta getRuta02() {
        return ruta02;
    }

    public void setRuta02(Ruta ruta02) {
        this.ruta02 = ruta02;
    }

    public Ruta getRuta03() {
        return ruta03;
    }

    public void setRuta03(Ruta ruta03) {
        this.ruta03 = ruta03;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", direccion=" + direccion + ",\n ruta01=" + ruta01.toString() + ",\n ruta02=" + ruta02.toString() + ",\n ruta03=" + ruta03.toString() + '}';
    }
    
    

}

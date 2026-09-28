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
public class Ruta {
    //Atributos
    private int identificador;
    private String origen;
    private String destino;
    private Vuelo vuelo01;
    private Vuelo vuelo02;
    
    //Contructores
    public Ruta(){
        origen="";
        destino="";
        vuelo01=new Vuelo();
        vuelo02=new Vuelo();
    }

    public Ruta(int identificador, String origen, String destino) {
        this.identificador = identificador;
        this.origen = origen;
        this.destino = destino;
    }
    
    //Metodos get y set
    
    public int getIdentificador(){
        return identificador;
    }
    public void setIdentificador(int valor){
        identificador=valor;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    //Metodo get y set de los vuelos

    public Vuelo getVuelo01() {
        return vuelo01;
    }

    public void setVuelo01(Vuelo vuelo01) {
        this.vuelo01 = vuelo01;
    }

    public Vuelo getVuelo02() {
        return vuelo02;
    }

    public void setVuelo02(Vuelo vuelo02) {
        this.vuelo02 = vuelo02;
    }
    
    
    
    //Metodo to string

    @Override
    public String toString() {
        return "Ruta{" + "identificador=" + identificador + ", origen=" + origen + ", destino=" + destino + ",\n      vuelo01=" + vuelo01 + ",\n      vuelo02=" + vuelo02 + '}';
    }

 
}

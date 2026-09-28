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
public class Vuelo {
    
    //Declaracion de constantes
    public final static int DOMINGO=1;
    public final static int LUNES=2;
    public final static int MARTES=3;
    public final static int MIERCOLES=4;
    public final static int JUEVES=5;
    public final static int VIERNES=6;
    public final static int SABADO=7;
    
    //Atributos
    private int dia;
    private int hora;
    private String codigo;
    // Constructores
    // Constructor por defecto
    public Vuelo(){
        System.out.println("Constructor por defecto");
        codigo="";
        
        
    }
    //Constructor con todos los atributos

    public Vuelo(int dia, int hora, String codigo) {
        this.dia = dia;
        this.hora = hora;
        this.codigo = codigo;
    }
    
    //Metodos get y set
    
    public int getDia(){
        return dia;
    }
    
    public void setDia(int dia){
        this.dia=dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
   //Metodos de negocio 

    @Override
    public String toString() {
        return "Vuelo{" + "dia=" + dia + ", hora=" + hora + ", codigo=" + codigo + '}';
    }
}

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
public class EmpresaAviacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo de Algoritmia");
        //Crear referencia a la clase
        Empresa em01;
        //Vuelo miVuelo;
        //Materializar el objeto
        em01 = new Empresa("Avianca", "Calle 26 68-05");
        //miVuelo=new Vuelo(Vuelo.LUNES,15,"AID21");
        //miVuelo.setDia(Vuelo.LUNES);

        //miVuelo.setHora(15);
        //miVuelo.setCodigo("AID21");
        //Asignar nombre y direccion
        em01.setNombre("Avianca");
        em01.setDireccion("Calle 26 68-05");

        //Crear rutas de la empresa
        Ruta r01;
        r01 = new Ruta(1, "Bogota", "Cali");
        Ruta r02 = new Ruta(2, "Bogota", "Madrid");
        Ruta r03 = new Ruta(3, "Medellin", "Cartagena");
        //Asignar rutas a la empresa
        em01.setRuta01(r01);
        em01.setRuta02(r02);
        em01.setRuta03(r03);

        //Crear vuelos
        Vuelo vueloBog_Cali01 = new Vuelo(Vuelo.LUNES, 8, "BOGCAL01");
        Vuelo vueloBog_Cali02 = new Vuelo(Vuelo.VIERNES, 18, "BOGCAL02");
        Vuelo vueloBog_Mad01 = new Vuelo(Vuelo.SABADO, 22, "BOGMAD01");
        Vuelo vueloBog_Mad02 = new Vuelo(Vuelo.MIERCOLES, 6, "BOGMAD02");
        Vuelo vueloMed_Ctg01 = new Vuelo(Vuelo.JUEVES, 11, "MEDCTG01");
        Vuelo vueloMed_Ctg02 = new Vuelo(Vuelo.MARTES, 14, "MDECTG02");

        //Asignar vuelos a rutas
        r01.setVuelo01(vueloBog_Cali01);
        r01.setVuelo02(vueloBog_Cali02);
        r02.setVuelo01(vueloBog_Mad01);
        r02.setVuelo02(vueloBog_Mad02);
        r03.setVuelo01(vueloMed_Ctg01);
        r03.setVuelo02(vueloMed_Ctg02);

        //Mostrar el valor de los atributos
        //System.out.println("Nombre "+em01.getNombre()+" Direccion "+em01.getDireccion());
        System.out.println(em01.toString());
    }

}

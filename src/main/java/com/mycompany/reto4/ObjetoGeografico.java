
package com.mycompany.reto4;


public class ObjetoGeografico {
    //Asignacion de los atributos
    private String nombreCA;
    private int ID;
    private String municipio;
   
    //Constructor de la clase ObjetoGeografico
    public ObjetoGeografico (String nombreCA, int ID, String municipio){
        this.nombreCA=nombreCA;
        this.ID=ID;
        this.municipio=municipio;
        
    }

    //Construccion de los metodos set y get
    public String getNombreCA() {
        return nombreCA;
    }


    public void setNombreCA(String nombreCA) {
        this.nombreCA = nombreCA;
    }


    public int getID() {
        return ID;
    }


    public void setID(int ID) {
        this.ID = ID;
    }

   
    public String getMunicipio() {
        return municipio;
    }

    
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
    
}

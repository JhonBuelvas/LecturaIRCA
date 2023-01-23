
package com.mycompany.reto4;


public class CuerpoDeAgua extends ObjetoGeografico{
    //Asignacion de los atributos
    private float IRCA;
    private String TCuerpoAgua;
    private String TAgua;
    
    public CuerpoDeAgua (String nombreCA, int ID, String municipio, String TCuerpoAgua, String TAgua, float IRCA){
        super(nombreCA, ID, municipio);
        this.TCuerpoAgua=TCuerpoAgua;
        this.TAgua=TAgua;
        this.IRCA=IRCA;
    }
    //creacion del metodo nivel 
    public String nivel ( ){
        if (getIRCA()>80 && getIRCA() <=100){
            return "INVIABLE SANITARIAMENTE";
        }else if (getIRCA()>35 && getIRCA() <=80){
            return "ALTO";
        }else if (getIRCA()>14 && getIRCA() <=35){
            return "MEDIO";
        }else if (getIRCA()>5 && getIRCA() <=14){
           return "BAJO";
        }else if (getIRCA()>=0 && getIRCA() <=5){
            return "SIN RIESGO";
        }else return "FUERA DE RANGO";
    
    }

    //Construccion de los metodos set y get
    public float getIRCA() {
        return IRCA;
    }

    
    public void setIRCA(float IRCA) {
        this.IRCA = IRCA;
    }

    
    public String getTCuerpoAgua() {
        return TCuerpoAgua;
    }

    
    public void setTCuerpoAgua(String TCuerpoAgua) {
        this.TCuerpoAgua = TCuerpoAgua;
    }

    
    public String getTAgua() {
        return TAgua;
    }

    
    public void setTAgua(String TAgua) {
        this.TAgua = TAgua;
    }
    
    
}

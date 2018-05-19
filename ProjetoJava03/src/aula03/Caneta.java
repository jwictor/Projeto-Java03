
package aula03;


public class Caneta {
    
    //Atributos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    
   protected boolean tampa;
    
    //Metodos
    void Status(){
        System.out.println("Modelo:"+ this.modelo);
        System.out.println("Uma caneta:" + this.cor);
        System.out.println("Ponta da caneta é:" + this.ponta);
        System.out.println("está tampada?:"+ this.tampa);
    }
    
    public void rabiscar(){
        if (this.tampa == true){
            System.out.println("ERRo não posso rabistcar");
        }else{
            System.out.println("Estou Rabiscando");
        }
        
    }
    private void tampar(){
        this.tampa = true;
    }
    private void destampar(){
     this.tampa = false;   
    }
}

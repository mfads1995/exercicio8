
package Questão1;


public class Papagaio extends Ave{
    
    private String Frase;
    
    public String getFrase(){
        return this.Frase;
    }
    
    public void setFrase(String f){
        this.Frase = f;
    }
    
    public void Talk(){
        System.out.println(this.getFrase());
    }
    
    public Papagaio(String n, boolean v, String f){
        super(n, v);
        this.setFrase(f);
    }
}

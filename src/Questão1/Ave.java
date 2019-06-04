
package Questão1;


public class Ave extends Animal{
    
    private boolean Voa;
    
    public boolean getVoa(){
        return this.Voa;
    }
    
    public void setVoa(boolean v){
        this.Voa = v;
    }
    
    public Ave(String n, boolean v){
        super(n);
        this.setVoa(v);
    }
    
    public void talk(){
        System.out.println("Piu-Piu");
    }
}

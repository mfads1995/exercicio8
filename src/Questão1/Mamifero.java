
package Questão1;


public class Mamifero extends Animal{
    
    private int Patas;
    
    public int getPatas(){
        return this.Patas;
    }
    
    public void setPatas(int p){
        this.Patas = p;
    }
    
    public Mamifero(String n, int p){
        super(n);
        this.setPatas(p);
    }
}

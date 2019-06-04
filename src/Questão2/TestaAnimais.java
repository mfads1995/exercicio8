
package Questão2;
import Questão1.Papagaio;
import Questão1.Arara;
import Questão1.Cachorro;
import Questão1.Vaca;


public class TestaAnimais {
    
    public static void main(String[] args) {
        Papagaio p1 = new Papagaio("Loro", true, "Biscoito!");
        p1.Imprime();
        p1.Talk();
        
        Arara a1 = new Arara("Ara", true);
        a1.Imprime();
        a1.Talk();
        
        Cachorro c1 = new Cachorro("Hunter", 4, true);
        c1.Imprime();
        c1.Talk();
        
        Vaca v1 = new Vaca("Pachola", 4, true);
        v1.Imprime();
        v1.Talk();
    }
}

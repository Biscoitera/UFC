
package trabalhoparte2;

import java.util.ArrayList;


public class Luta {
    
    ArrayList<Round> rounds;
    int id;
    Lutador lutador1;
    Lutador lutador2;
    
    public Luta(String id, Lutador l1, Lutador l2){
        rounds = new ArrayList<>();
        this.id = Integer.parseInt(id);
        this.lutador1 = l1;
        this.lutador2 = l2;
        System.out.println("Luta " + id + ": " + lutador1.getNome() + " VS " + lutador2.getNome());
    }
    
    public void addRound(Round round){
        
        this.rounds.add(round);
        
    }
    
    public String resultado(){
        int res = 0;
        Round round;
        for(int i = 0; i < rounds.size(); i++){
            res += rounds.get(i).resultado();
        }
        if(res < 0){
            return ("Vencedor: " + lutador1.getNome());
        }
        else return("Vencedor: " + lutador2.getNome());
    }
}

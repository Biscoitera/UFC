package trabalhoparte2;

import java.util.ArrayList;
import javax.persistence.*;

@Entity
@Table (name = "luta")
public class Luta {
    
    ArrayList<Round> rounds;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
    @Column
    int ano;
    
    //@ManyToMany
    
    Lutador lutador1;
    Lutador lutador2;
    
    public Luta(String id, Lutador l1, Lutador l2){
        rounds = new ArrayList<>();
        this.id = Integer.parseInt(id);
        this.lutador1 = l1;
        this.lutador2 = l2;
        System.out.println("Luta " + id + ": " + lutador1.nome + " VS " + lutador2.nome);
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
            return ("Vencedor: " + lutador1.nome);
        }
        else return ("Vencedor: " + lutador2.nome);
    }
    
}

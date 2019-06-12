

import java.util.ArrayList;


public class Luta {
    
    ArrayList<Round> rounds;
    
    int id;
    
    int ano;
    
    Lutador lutador1;
    Lutador lutador2;
    
    String vencedor;
    
    public Luta(String id, Lutador l1, Lutador l2) throws Exception{
        rounds = new ArrayList<>();
        this.id = Integer.parseInt(id);
        this.lutador1 = l1;
        this.lutador2 = l2;
        System.out.println("Luta " + id + ": " + lutador1.nome + " VS " + lutador2.nome);
        vencedor = resultado();
        LutaDAO.inserir(this);
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
            vencedor = lutador1.nome;
            return ("Vencedor: " + lutador1.nome);
        }
        else {
            vencedor = lutador2.nome;
            return ("Vencedor: " + lutador2.nome);
        }
    }
    
}

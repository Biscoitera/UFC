public class Acao {

    public int ataque;
    public int soco;
    public int chute;
    public int defesa;
    public int poder;
    public int modalidade;

    public Acao(String ataque,String soco,String chute,String defesa,String poder,String modalidade){

        this.ataque = Integer.parseInt(ataque);
        this.chute = Integer.parseInt(chute);
        this.soco = Integer.parseInt(soco);
        this.defesa = Integer.parseInt(defesa);
        this.poder = Integer.parseInt(poder);
        this.modalidade = Integer.parseInt(modalidade);  
    }
    
    public void printAcao(){
        
        if(ataque != 0){
            if(soco != 0){
                System.out.println("Soco!");
            }
            if(chute != 0){
                System.out.println("Chute!");
            }
        }
        else{
            if(defesa != 0){
                System.out.println("Defesa!");
            }
        
            if(poder != poder){
                System.out.println("Poder");
            }
        }
    }    
}


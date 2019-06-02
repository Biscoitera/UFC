public class Round {
    
    int id;
    Acao acao1;
    Acao acao2;
    
    public Round(String id, Acao acao1, Acao acao2){
        
        this.id = Integer.parseInt(id);
        this.acao1 = acao1;
        this.acao2 = acao2;
    }
    
    public int resultado(){
        
        if(acao1.defesa == 1 || acao2.defesa == 1){
            return 0;
        }
        
        if(acao1.poder == 1 && acao2.poder == 0 ){
            return -1;
        }
        if(acao2.poder == 1 && acao1.poder == 0 ){
            return 1;
        }
        
        if(acao1.poder == 1 && acao2.poder == 1){
            
            if(acao1.modalidade > acao2.modalidade){
                return -1;
            }
            if(acao1.modalidade < acao2.modalidade){
                return 1;
            }
            else{
                return 0;
            }
        }
        
        
        if(acao1.soco == 1 && acao2.soco == 1){
            
            if(acao1.modalidade > acao2.modalidade){
                return -1;
            }
            if(acao1.modalidade < acao2.modalidade){
                return 1;
            }
            else{
                return 0;
            }
        }
        
        if(acao1.chute == 1 && acao2.chute == 1){
            
            if(acao1.modalidade > acao2.modalidade){
                return -1;
            }
            if(acao1.modalidade < acao2.modalidade){
                return 1;
            }
            else return 0;
        }
        
        if(acao1.soco == 1 && acao2.defesa == 0 ){
            if(acao2.chute == 1){
                return 2;
            }
            else return -1;
        }
        
        if(acao1.chute == 1 && acao2.defesa == 0){
            return -1;
        }
        if(acao2.chute == 1 && acao1.defesa == 0){
            return 2;
        }
        return 0;
    }
}

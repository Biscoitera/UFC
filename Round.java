


public class Round {
    
    
    int id;
    
    Acao acao1;
    
    String tpoAcao1;
    Acao acao2;
    
    String tpoAcao2;
    
    public Round(String id, Acao acao1, Acao acao2){
        
        this.id = Integer.parseInt(id);
        this.acao1 = acao1;
        this.tpoAcao1 = acao1.getId();
        this.acao2 = acao2;
        this.tpoAcao2 = acao2.getId();
        //Query query = session.createQuery("insert into round (this.id, tpoAcao1, tposAcao2) select * from Round");
    }
    
    public int resultado(){
        
        if(acao1.getDefesa() == 1 || acao2.getDefesa() == 1){
            return 0;
        }
        
        if(acao1.getPoder() == 1 && acao2.getPoder() == 0 ){
            return -1;
        }
        if(acao2.getPoder() == 1 && acao1.getPoder() == 0 ){
            return 1;
        }
        
        if(acao1.getPoder() == 1 && acao2.getPoder() == 1){
            
            if(acao1.getModalidade() > acao2.getModalidade()){
                return -1;
            }
            if(acao1.getModalidade() < acao2.getModalidade()){
                return 1;
            }
            else{
                return 0;
            }
        }
        
        
        if(acao1.getSoco() == 1 && acao2.getSoco() == 1){
            
            if(acao1.getModalidade() > acao2.getModalidade()){
                return -1;
            }
            if(acao1.getModalidade() < acao2.getModalidade()){
                return 1;
            }
            else{
                return 0;
            }
        }
        
        if(acao1.getChute() == 1 && acao2.getChute() == 1){
            
            if(acao1.getModalidade() > acao2.getModalidade()){
                return -1;
            }
            if(acao1.getModalidade() < acao2.getModalidade()){
                return 1;
            }
            else return 0;
        }
        
        if(acao1.getSoco() == 1 && acao2.getDefesa() == 0 ){
            if(acao2.getChute() == 1){
                return 2;
            }
            else return -1;
        }
        
        if(acao1.getChute() == 1 && acao2.getDefesa() == 0){
            return -1;
        }
        if(acao2.getChute() == 1 && acao1.getDefesa() == 0){
            return 2;
        }
        return 0;
    }
}

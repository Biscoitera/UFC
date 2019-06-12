
public class Acao {

    private int ataque;
    private int soco;
    private int chute;
    private int defesa;
    private int poder;
    private int modalidade;
    
    private String id;

    public Acao(String ataque,String soco,String chute,String defesa,String poder,String modalidade){

        this.ataque = Integer.parseInt(ataque);
        this.chute = Integer.parseInt(chute);
        this.soco = Integer.parseInt(soco);
        this.defesa = Integer.parseInt(defesa);
        this.poder = Integer.parseInt(poder);
        this.modalidade = Integer.parseInt(modalidade);
        
        if(this.ataque != 0){
            if(this.soco != 0){
                this.id = ("Soco");
            }
            if(this.chute != 0){
                this.id = ("Chute");
            }
        }
        else{
            if(this.defesa != 0){
                this.id = ("Defesa");
            }
        
            if(this.poder != 0){
                this.id = ("Poder");
            }
        }
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getSoco() {
        return soco;
    }

    public void setSoco(int soco) {
        this.soco = soco;
    }

    public int getChute() {
        return chute;
    }

    public void setChute(int chute) {
        this.chute = chute;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getModalidade() {
        return modalidade;
    }

    public void setModalidade(int modalidade) {
        this.modalidade = modalidade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
}


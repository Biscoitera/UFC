package trabalhoparte2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "modalidade")
public class Modalidade {
    
    @Id
    private int id;
    
    @Column
    private String nome;
    
    
    public Modalidade(String nome, int id){
        
        this.nome = nome;
        this.id = id;
    }
}

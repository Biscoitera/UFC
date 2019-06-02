import javax.persistence.*;
@Entity
@Table (name = "lutador")

public class Lutador {
	
	@Id
    String nome;
	
	@Column
    String categoria;
	
	@Column
    String pais;
	
	@Column
    String sexo;
    
    
    public Lutador(String nome, String categoria, String pais, String sexo){
        
        this.nome = nome;
        this.categoria = categoria;
        this.pais = pais;
        this.sexo = sexo;
    }
}



import java.util.ArrayList;



public class Lutador {
	
    
    String nome;
	
    
    String categoria;
	
    
    String pais;
	
    
    String sexo;
    
    
    public Lutador(String nome, String categoria, String pais, String sexo){
        
        this.nome = nome;
        this.categoria = categoria;
        this.pais = pais;
        this.sexo = sexo;
        //Query query = session.createQuery("insert into Lutador (nome, categoria, pais, sexo) select * from Lutador");
    }
    
    
}


package trabalhoparte2;


public class Lutador {
    private String nome;
    private String categoria;
    private String pais;
    private String sexo;
    
    public Lutador(String nome, String categoria, String pais, String sexo){
        
        this.nome = nome;
        this.categoria = categoria;
        this.pais = pais;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}

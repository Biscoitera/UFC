package trabalhoparte2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Classe utilizada para fazer realizar as operações de banco de dados sobre a entity Lutador.
 */
public class LutadorDAO {
    
    static String url="jdbc:oracle:thin:@localhost:1521:XE";
    static String usuario = "root";
    static String senha = "12345";
    static Connection conexao;
    
    public static void conectar() throws SQLException{
        conexao = DriverManager.getConnection(url,usuario,senha);
        conexao.setAutoCommit(false);
    }
    
    public static void desconectar() throws SQLException{
        conexao.close();
    }
    
    public static void inserir(String nome, String pais, String sexo) throws Exception{
        String sql = "Insert into Lutador values('"+ nome +"','"+ pais +"','"+ sexo +"')";
        Statement statement = conexao.createStatement();
        statement.execute(sql);
        conexao.commit();
        
    }
    
    public static void consultar(String nome) throws SQLException{
        String sql = "Select * from Lutador where nome = "+nome+"";
        Statement statement = conexao.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
            System.out.println("Nome: "+rs.getString(1)+" País: "+rs.getString(2)+" Sexo: "+rs.getString(3));
        }
    }
    
    public static void consultarTodos() throws SQLException{
        String sql = "Select * from Lutador";
        Statement statement = conexao.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        int contador = 0;
        while(rs.next()){
            contador++;
            System.out.println("Nome: "+rs.getString(1)+" Pais: "+" Sexo: "+ rs.getString(3));
            
        }
        System.out.println("Registros: "+ contador);
    }
    
    public static void alterar(){
        
    }
    
    public static void excluir(String nome) throws SQLException{
        String sql = "Delete from Lutador where nome = "+nome;
        Statement statement = conexao.createStatement();
        statement.executeQuery(sql);
        conexao.commit();
    }
}

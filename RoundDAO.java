import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Classe utilizada para fazer realizar as operações de banco de dados sobre a entity Lutador.
 */
public class RoundDAO {
    
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
    
    public static void inserir(Round round, int idLuta) throws Exception{
        String sql = "Insert into Round values("+ round.id +","+ idLuta +",'"+ round.acao1.getId() +"','"+ round.acao2.getId() +"')";
        Statement statement = conexao.createStatement();
        statement.execute(sql);
        conexao.commit();
        
    }
    
    public static void consultar(int id) throws SQLException{
        String sql = "Select * from Round where id = "+id+"";
        Statement statement = conexao.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
            System.out.println("Ano: "+rs.getInt(1));
        }
    }
    
    public static void consultarTodos() throws SQLException{
        String sql = "Select * from Lutador";
        Statement statement = conexao.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        int contador = 0;
        while(rs.next()){
            contador++;
            System.out.println("Round: "+rs.getInt(1));
            
        }
        System.out.println("Registros: "+ contador);
    }
    
    public static void alterar(){
        
    }
    
    public static void excluir(int ano) throws SQLException{
        String sql = "Delete from Liga where ano = "+ano;
        Statement statement = conexao.createStatement();
        statement.executeQuery(sql);
        conexao.commit();
    }
}


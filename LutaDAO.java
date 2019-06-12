
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Classe utilizada para fazer realizar as operações de banco de dados sobre a entity Lutador.
 */
public class LutaDAO {
    
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
    
    public static void inserir(Luta luta) throws Exception{
        String sql = "Insert into Lutador values('"+ luta.lutador1.nome +"','"+ luta.lutador2.nome +"','"+ luta.vencedor +"')";
        Statement statement = conexao.createStatement();
        statement.execute(sql);
        conexao.commit();
        
    }
    
    public static void consultar(String nome) throws SQLException{
        String sql = "Select * from Luta where Lutador1 = "+nome+"or Lutador2 = "+nome;
        Statement statement = conexao.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
            System.out.println("Lutador 1: "+rs.getString(1)+" Lutador 2: "+rs.getString(2)+" Vencedor: "+rs.getString(3));
        }
    }
    
    public static void consultarTodos() throws SQLException{
        String sql = "Select * from Luta";
        Statement statement = conexao.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        int contador = 0;
        while(rs.next()){
            contador++;
            System.out.println("Lutador 1: "+rs.getString(1)+" Lutador 2: "+rs.getString(2)+" Vencedor: "+rs.getString(3));
        }
        System.out.println("Registros: "+ contador);
    }
    
    
    
}

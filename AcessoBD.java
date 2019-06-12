


import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AcessoBD {
    
    static String url="jdbc:oracle:thin:@localhost:1521:XE";
    static String usuario = "MOBILE_COOPERALFA";
    static String senha = "engeman";
    static Connection conexao;
    
    public static void conectar() throws SQLException{
        conexao = DriverManager.getConnection(url,usuario,senha);
    }
    
    public static void consultarLutador() throws SQLException{
        String consulta = "SELECT * FROM Lutador";
        Statement statement = conexao.createStatement();
        ResultSet rs = statement.executeQuery(consulta);
        
        while(rs.next()){
            JOptionPane.showMessageDialog(null,"Nome: " + rs.getString(1) + " nacionalidade: " + rs.getString(2));
        }
                
    }            
                
                
    public static void mostrarMetaInfoBD() throws SQLException{
        DatabaseMetaData meta = conexao.getMetaData();
        String fabricanteBD = meta.getDatabaseProductName();
        String versaoBD = meta.getDatabaseProductVersion();
        JOptionPane.showMessageDialog(null,fabricanteBD +"<==>"+versaoBD);
    }
    
    public static void test(){
        try {
            conectar();
            mostrarInfoBD();
            //consultarLutador();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(AcessoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private static void mostrarInfoBD() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

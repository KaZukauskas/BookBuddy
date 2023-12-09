import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBD {
    private static String usuario = "avnadmin";
    private static String senha = "AVNS_8Vfe-DPq9B_VjGTaU8-";
    private static String host = "mysql-c34d481-projetoa3.aivencloud.com";
    private static String porta = "25503";
    private static String bd = "db_bookbuddy";
    public static Connection obtemConexao (){
        try {
            Connection c = DriverManager.getConnection(
            "jdbc:mysql://" + host + ":" + porta + "/" + bd + "?user=" + usuario + 
            "&password=" + senha + 
            "&useTimezone=true&serverTimezone=America/Sao_Paulo");
            return c;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

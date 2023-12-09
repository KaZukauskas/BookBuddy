import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class GeneroDAO {
    public String[] obterGeneros() throws Exception {
        String sql = "SELECT * FROM tb_genero";
        try (
            Connection conn = ConexaoBD.obtemConexao();
            PreparedStatement ps = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = ps.executeQuery()
        ) {
            ArrayList<String> listaGeneros = new ArrayList<>();

            while (rs.next()) {
                String genero = rs.getString("genero");
                listaGeneros.add(genero);
            }

            String[] generos = listaGeneros.toArray(new String[0]);
            return generos;
        }
    }
}

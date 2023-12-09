import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LivroDAO {
   public Livro[] obterLivro() throws Exception {
    String sql = "SELECT * FROM tb_livro";
    try (Connection conn = ConexaoBD.obtemConexao();
         PreparedStatement ps = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
         ResultSet rs = ps.executeQuery()) {

        int totalLivros = 0;
        if (rs.last()) {
            totalLivros = rs.getRow();
        }

        Livro[] livros = new Livro[totalLivros];
        rs.beforeFirst();
        int cont = 0;
        while (rs.next()) {
            String titulo = rs.getString("titulo");
            String genero = rs.getString("genero");
            String autor = rs.getString("autor");
            int nota = rs.getInt("nota"); 

            Livro l = new Livro(titulo, genero, autor);
            l.setNota(nota); 
            livros[cont] = l;
            cont++;
        }
        return livros;
    }
    catch (Exception e) {
        e.printStackTrace();
        throw e;
    }
}
   public Livro obterLivroPorTitulo(String titulo) throws Exception {
    String sql = "SELECT id_livro, genero, autor FROM tb_livro WHERE titulo = ?";
    try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, titulo);

        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                int id = rs.getInt("id_livro");
                String genero = rs.getString("genero");
                String autor = rs.getString("autor");
                return new Livro(id, titulo, genero, autor);
            }
        }
    }
    return null;
}

    public Livro obterLivroPorId(int id) throws Exception {
         Livro livro = null;
    String sql = "SELECT * FROM tb_livro WHERE id_livro = ?";
    
    try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, id);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                livro = new Livro(
                    rs.getInt("id_livro"),
                    rs.getString("titulo"),
                    rs.getString("genero"),
                    rs.getString("autor"));
            }
        }
    }

    return livro;
    
}
   
    public String[] obterGeneros() throws Exception {
        String sql = "SELECT genero FROM tb_genero";
        try (Connection conn = ConexaoBD.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            int totalGeneros = 0;
            while (rs.last()) {
                totalGeneros++;
            }

            String[] generos = new String[totalGeneros];
            rs.beforeFirst();
            int cont = 0;
            while (rs.next()) {
                generos[cont] = rs.getString("genero");
                cont++;
            }
            return generos;
        }
    }
    
    public void  inserirLivro(Livro livro) throws Exception {
        String sql = "INSERT INTO tb_livro (titulo, genero, autor) VALUES (?, ?, ?)";
        try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, livro.getTitulo());
            ps.setString (2, livro.getGenero());
            ps.setString (3, livro.getAutor());
            ps.execute();
        }
    }
    public void atualizarLivro (Livro livro) throws Exception {
        String sql = "UPDATE tb_livro SET titulo = ?, genero = ?, autor = ? WHERE id_livro = ?";
        
        try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, livro.getTitulo());
            ps.setString(2, livro.getGenero());
            ps.setString(3, livro.getAutor());
            ps.setInt(4, livro.getId_livro());
            ps.executeUpdate();
        }
}
    public void removerLivro(Livro livro) throws Exception{
        String sql = "DELETE FROM tb_livro WHERE titulo = ?";
        try(Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql);){
            ps.setString(1, livro.getTitulo());
            ps.execute();
        }
    }
    
}
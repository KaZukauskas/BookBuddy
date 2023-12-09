public class Livro {
    private int id_livro; 
    private String titulo;
    private String genero;
    private String autor;
    private int nota;
    private String nome;
    private int numAvaliacoes;
    private double somaNotas;

    public Livro(int id_livro, String titulo, String genero, String autor) {
        this.id_livro = id_livro;
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.nota = nota;
        this.numAvaliacoes = 1;
        this.somaNotas = nota;
    }
    
    public Livro(String titulo, String genero, String autor) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.numAvaliacoes = 0;  
        this.somaNotas = 0;    
    }

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumAvaliacoes() {
        return numAvaliacoes;
    }

    public void setNumAvaliacoes(int numAvaliacoes) {
        this.numAvaliacoes = numAvaliacoes;
    }

    public double getSomaNotas() {
        return somaNotas;
    }

    public void setSomaNotas(double somaNotas) {
        this.somaNotas = somaNotas;
    }
}
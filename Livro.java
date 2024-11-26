
public class Livro {

  private String titulo;
  private String autor;
  private String editora;
  private int anoPublicacao;
  private String ISBN;
  private int quantidadeDisponivel;

  // Construtor

  public Livro(String titulo, String autor, String editora, int anoPublicacao, String ISBN, int quantidadeDisponivel) {

    this.titulo = titulo;
    this.autor = autor;
    this.editora = editora;
    this.anoPublicacao = anoPublicacao;
    this.ISBN = ISBN;
    this.quantidadeDisponivel = quantidadeDisponivel;

  }

  public int getAnoPublicacao() {
    return anoPublicacao;
  }

  public String getAutor() {
    return autor;
  }

  public String getEditora() {
    return editora;
  }

  public String getISBN() {
    return ISBN;
  }

  public int getQuantidadeDisponivel() {
    return quantidadeDisponivel;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setAnoPublicacao(int anoPublicacao) {
    this.anoPublicacao = anoPublicacao;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public void setEditora(String editora) {
    this.editora = editora;
  }

  public void setISBN(String iSBN) {
    ISBN = iSBN;
  }

  public void setQuantidadeDisponivel(int quantidadeDisponivel) {
    this.quantidadeDisponivel = quantidadeDisponivel;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void emprestar() {
    this.quantidadeDisponivel--;
  }

  public void devolver() {
    this.quantidadeDisponivel++;
  }

  public String toString() {
    return "Título: " + titulo + "\nAutor: " + autor + "\nEditora: " + editora + "\nAno de Publicação: " + anoPublicacao
        + "\nISBN: " + ISBN + "\nQuantidade Disponível: " + quantidadeDisponivel;
  }

}

class Post {

  final String texto;

  private final Usuario[] curtidas = new Usuario[100];
  private int numcurtida = 0;

  private final Comentario[] comentarios = new Comentario[100];
  private int numcomentario = 0;

  Post(String texto) {
    this.texto = texto;
  }

  public String toString() {
    return "Post: " + texto;
  }

  void curtida(Usuario curtidor) {
    curtidas[numcurtida++] = curtidor;
  }

  int getCurtidas() {
    return numcurtida;
  }

  void comentario(Usuario comentador, String comentario) {
    Comentario c = new Comentario(comentador, comentario);
    comentarios[numcomentario++] = c;
  }

  Comentario getComentario(int num) {
    return comentarios[num];
  }










}

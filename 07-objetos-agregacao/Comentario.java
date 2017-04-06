class Comentario {

  final Usuario usuario;
  final String texto;

  Comentario(Usuario usuario, String texto) {
    this.usuario = usuario;
    this.texto = texto;
  }

  public String toString() {
    return usuario + " Comentario: " + texto;
  }

}

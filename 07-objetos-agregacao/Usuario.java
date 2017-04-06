class Usuario {
  final String nome;
  
  private final Post[] postagens = new Post[100];
  private int numpost = 0;

  Usuario(String nome) {
    this.nome = nome;
  }

  void postagem(String texto) {
    Post p = new Post(texto);
    postagens[numpost++] = p;
  }

  Post getPostagem(int num) {
    return postagens[num];
  }

  int getPostagens() {
    return numpost;
  }

  public String toString() {
    return "Usuario: " + this.nome;
  }








}

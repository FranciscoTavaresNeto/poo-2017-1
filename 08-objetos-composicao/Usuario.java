class Usuario {
  final String email;
  final Perfil perfil;
  // final Album album;

  Usuario(String email) {
    this.email = email;
    // "Peça chave" é instanciar
    // o perfil na construção do Usuário
    // COMPOSIÇÃO
    this.perfil = new Perfil();
    // this.album = new Album();
  }

}

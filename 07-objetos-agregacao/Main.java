class Main {

  public static void main(String[] args) {

    System.out.println("Rede Social 0.1");

    Usuario domingos = new Usuario("Domingos");
    Usuario penna = new Usuario("Penna");
    Usuario jesse = new Usuario("Jesse");

    System.out.println(domingos.nome);

    System.out.println(domingos);
    System.out.println(penna);
    System.out.println(jesse);

    // TODO: melhoria futura
    // Post p = domingos.postagem("Oi!");

    System.out.println(domingos.getPostagens()); // 0

    domingos.postagem("Oi!");

    Post p = domingos.getPostagem(0);
    System.out.println(p);

    System.out.println(domingos.getPostagem(0).texto);

    System.out.println(domingos.getPostagens()); // 1

    domingos.postagem("Tchau!");

    System.out.println(domingos.getPostagens()); // 2

    System.out.println("-------------------");
    System.out.println("Postagens de " + domingos.nome + ":");
    for (int i = 0; i < domingos.getPostagens(); i++) {
      System.out.println(domingos.getPostagem(i).texto);
    }
    System.out.println("--------------------");

    System.out.println(domingos.getPostagem(1).getCurtidas()); // 0

    domingos.getPostagem(1).curtida(jesse);

    System.out.println(domingos.getPostagem(1).getCurtidas()); // 1

    domingos.getPostagem(1).comentario(penna, "Podicrê");

    System.out.println(domingos.getPostagem(1).getComentario(0));

    System.out.println(domingos.getPostagem(1).getComentario(0).usuario.getPostagem(0));

    penna.postagem("Eu que sei!");
    // navegar no grafo de objetos
    System.out.println(domingos.getPostagem(1).getComentario(0).usuario.getPostagem(0));









  }
}

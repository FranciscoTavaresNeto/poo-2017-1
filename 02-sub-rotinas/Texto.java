class Texto {
  static char up(char letra) {
    if (letra >= 'a' && letra <= 'z') {
      letra = (char) (letra - 32);
    }
    return letra;
  }
  // sobrecarga de método (é um tipo de polimorfismo)
  static String up(String texto) {
    String resp = "";
    for (int i = 0; i < texto.length(); i++) {
      resp += up(texto.charAt(i));
    }
    return resp;
  }

  static char down(char letra) {
    if (letra >= 'A' && letra <= 'Z') {
      letra = (char) (letra + 32);
    }
    return letra;
  }
  // sobrecarga de método (é um tipo de polimorfismo)
  static String down(String texto) {
    String resp = "";
    for (int i = 0; i < texto.length(); i++) {
      resp += down(texto.charAt(i));
    }
    return resp;
  }

  static String substr(String texto, int indice, int tamanho) {
    String resp = "";
    for (int i = indice;
      i < indice + tamanho && i < texto.length(); i++) {
      resp += texto.charAt(i);
    }
    return resp;
  }

  static String cap(String texto) {
    return up(texto.charAt(0))
      + down(substr(texto, 1, texto.length()));
  }





}

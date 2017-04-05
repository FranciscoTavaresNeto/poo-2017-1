// import static java.util.regex.Pattern.matches;
// if (!matches(...
class CPF {
  // CPF tem
  final String numero;

  CPF(String numero) { // construtor: pré-requisitos

    if (!java.util.regex.Pattern.matches("^\\d{11}$", numero))
      throw new IllegalArgumentException("CPF invalido");


    // if (numero.length() != 11)
    //   throw new IllegalArgumentException("CPF deve ter 11 dígitos");
    //
    // for (int i = 0; i < numero.length(); i++)
    //   if ( ! (numero.charAt(i) >= '0' && numero.charAt(i) <= '9'))
    //     throw new IllegalArgumentException("CPF inválido");

    this.numero = numero;
  }

  String formatado() {
    return numero.substring(0, 3) + "."
      + numero.substring(3, 6) + "."
      + numero.substring(6, 9) + "-"
      + numero.substring(9);
  }

  public String toString() {
    return this.formatado();
  }




}

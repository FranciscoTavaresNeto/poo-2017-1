package pkg16;

// polimorfismo paramétrico:
// Em Java é chamado de Generics

public interface IList<T> { // <T> é um parâmetro de tipo

    
  /**
   * Adiciona o elemento no fim da lista.
   * Parâmetros null são ignorados.
   *
   * @param o Elemento a ser adicionado
   */
  public void append(T o);
 
  /**
   * Adiciona o elemento no inicio da lista.
   * Parâmetros null são ignorados.
   *
   * @param o Elemento a ser adicionado
   */
  public void prepend(T o);
 
  /**
   * Adiciona o elemento em um índice específico
   *
   * @param o Elemento a ser adicionado
   * @param index índice onde o elemento deve ser inserido
   * @return boolean true se foi possível inserir, false caso contrário
   */
  public boolean insert(T o, int index);
 
  /**
   * Obtém um elemento dado um índice.
   * Índices não existentes retornam null.
   *
   * @param index Índice do objeto. Valores válidos são 0 <= index < count()
   * @return Object Elemento no índice informado ou null se não houver.
   */
  public T get(int index);
 
  /**
   * Retorna o primeiro elemento da lista.
   * Este método tem o mesmo efeito de get(0).
   * Retorna null se a lista estiver vazia.
   *
   * @return Object Elemento no primeiro índice da lista ou null se vazia.
   */
  public T getFirst();
 
  /**
   * Retorna o último elemento da lista.
   * Este método tem o mesmo efeito de get(count() - 1).
   * Retorna null se a lista estiver vazia.
   *
   * @return Object elemento no último índice da lista ou null se vazia.
   */
  public T getLast();
 
  /**
   * Remove e retorna o elemento contido no índice passado.
   * Retorna null se não há elemento no índice.
   *
   * @param index Índice do elemento a ser removido.
   * @return Object elemento removido ou null se o índice não existir.
   */
  public T drop(int index);
 
  /**
   * Remove o elemento contido no índice passado.
   * Retorna true se o elemento foi removido e false caso contrário.
   *
   * @param index Índice do elemento a ser removido.
   * @return boolean true ou false caso o elemento seja ou não removido.
   */
  public boolean delete(int index);
 
  /**
   * Remove o elemento da lista.
   * Retorna true se o objeto foi encontrado e removido e false caso contrário.
   *
   * @param o Elemento a ser removido.
   * @return boolean true ou false caso o elemento seja ou não removido.
   */
  public boolean remove(T o);
 
  /**
   * Remove todos os elementos da lista.
   * Este método reseta a lista.
   */
  public void clean();
 
  /**
   * Retorna a quantidade de elementos na lista.
   *
   * @return int quantidade de elementos.
   */
  public int count();
 
  /**
   * Retorna se há ou não o elemento na lista.
   *
   * @param o Elemento a ser verificado.
   * @return boolean true ou false caso o elemento se encontre ou não na lista.
   */
  public boolean has(T o);
 
  /**
   * Retorna se a lista está vazia.
   *
   * @return boolean true ou false se a lista estiver ou não vazia.
   */
  public boolean empty();
 
  /**
   * Consulta o índice do objeto
   *
   * @param o Elemento a ser localizado
   * @return índice do objeto ou -1 se ele não for encontrado
   */
  public int indexOf(T o);
  
  
  public void replace(T o, int index);        
 
}
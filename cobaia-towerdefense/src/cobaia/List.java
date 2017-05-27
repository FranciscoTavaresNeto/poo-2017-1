package cobaia;

public class List implements IList {

    private int tamanho = 2;
    private int pos = 0;
    private Object[] lista = new Object[tamanho];
   
    
    
    public void List() {
    }
    
    
    @Override
    public void append(Object o) {
        if  (o != null)   {  
          this.lista[this.pos++] = o;
          if (this.tamanho == this.pos)  { 
              this.tamanho += this.tamanho;
              Object[] lista2 = new Object[tamanho];
              System.arraycopy(this.lista, 0, lista2, 0, this.lista.length);
              this.lista =  lista2;            
           }
        }
    }

    @Override
    public void prepend(Object o) {
        if  (o != null) {
            Object[] lista2 = new Object[this.tamanho];
            lista2[0] = o;
            System.arraycopy(this.lista, 0, lista2, 1, this.pos);
            this.lista = lista2;
            this.pos++;
            if (this.tamanho == this.pos)  { 
                  this.tamanho += this.tamanho;
                  Object[] lista3 = new Object[tamanho];
                  System.arraycopy(this.lista, 0, lista3, 0, this.lista.length);
                  this.lista =  lista3;            
            }
        }
    }

    @Override
    public boolean insert(Object o, int index) {
        if ((o == null) || (index > this.pos) || (index < 0))     return  false;
        if (index == 0) {
            prepend(o);
            return true;
        }
        if (index == this.pos) {
            append(o);
            return true;
        }
        Object[] lista2 = new Object[tamanho];
        System.arraycopy(this.lista, 0, lista2, 0, index);
        lista2[index] = o;
        System.arraycopy(this.lista, index, lista2, index +1, this.lista.length - index-1);
        this.lista = lista2;
        pos++;
        if (this.tamanho == this.pos)  { 
                  this.tamanho += this.tamanho;
                  Object[] lista3 = new Object[tamanho];
                  System.arraycopy(this.lista, 0, lista3, 0, this.lista.length);
                  this.lista =  lista3;  
        }
        return true;
    }

    @Override
    public Object get(int index) {
        if (index == 0 && pos == 0) return null;
        if (index >= pos)   return null;
        return lista[index];
    }

    @Override
    public Object getFirst() {
        if (pos == 0)   return null;
        return  this.lista[0];
    }

    @Override
    public Object getLast() {
       if (pos == 0)    return null;
       else return lista[pos - 1];
    }

    @Override
    public Object drop(int index) {
        if (index >= this.pos || index < 0) return null;
        Object o = this.lista[index];
        Object[] lista2 = new Object[tamanho];
        System.arraycopy(this.lista, 0, lista2, 0, index);
        System.arraycopy(this.lista, index + 1, lista2, index, this.lista.length - index - 1);
        this.lista = lista2;
        pos--;
        return o;
        
    }

    @Override
    public boolean delete(int index) {
        if (index >= this.pos || index < 0 ) return false;
        Object[] lista2 = new Object[tamanho];
        System.arraycopy(this.lista, 0, lista2, 0, index);
        System.arraycopy(this.lista, index + 1, lista2, index, this.lista.length - index - 1);
        this.lista = lista2;
        pos--;
        return true;

    }

    @Override
    public boolean remove(Object o) {
       if (indexOf(o) == -1)    return false;
       return delete(indexOf(o));
       
    }

    @Override
    public void clean() {
        this.tamanho = 2;
        this.lista = new Object[tamanho];
        this.pos = 0;
        

    }

    @Override
    public int count() {
        return pos;
    }

    @Override
    public boolean has(Object o) {
        return indexOf(o) != -1;
    }

    @Override
    public boolean empty() {
        return pos == 0;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < this.pos; i++) {
           if (this.lista[i] == o)  return i; 
        }
        return -1;
    }

    @Override
    public void replace(Object o, int index) {
        this.lista[index] = o;
        
    }
    
}

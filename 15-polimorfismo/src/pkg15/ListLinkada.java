package pkg15;

/**
 *
 * @author torres
 */
public class ListLinkada implements IList {

    private int count = 0;
    private No primeiroNo = null;
    private No ultimoNo = null;
    
    @Override
    public void append(Object o) {
        
        if (o == null) return;
        
        No novoNo = new No();
        novoNo.elemento = o;
        if (primeiroNo == null) {
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else {
            ultimoNo.proximo = novoNo;
            ultimoNo = novoNo;
        }
        count++;
    }

    @Override
    public void prepend(Object o) {
        if (count == 0) return;
        No no = new No();
        no.elemento = o;
        no.proximo = primeiroNo;
        primeiroNo = no;
        count++;
    }

    @Override
    public boolean insert(Object o, int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object get(int index) {
        if (index > count - 1) return null;
        No n = primeiroNo;
        for (int i = 0; i < index; i++) n = n.proximo;
        return n.elemento;
    }

    @Override
    public Object getFirst() {
        if (primeiroNo == null) return null;
        return primeiroNo.elemento;
    }

    @Override
    public Object getLast() {
        if (ultimoNo == null) return null;
        return ultimoNo.elemento;
    }

    @Override
    public Object drop(int index) {
        if (index > count - 1) return null;
        // TODO melhorar esse código para
        // não desapontar os "antigos" mestres
        if (count == 1) {
            Object o = primeiroNo.elemento;
            primeiroNo = null;
            ultimoNo = null;
            count --;
            return o;
        } else {
            if (index == 0) {
                Object o = primeiroNo.elemento;
                primeiroNo = primeiroNo.proximo;
                count --;
                return o;
            }
            No n = primeiroNo;
            int i = 0;
            while (n != null) {
                if (i + 1 == index) {
                    Object o = n.proximo.elemento;
                    
                    n.proximo = n.proximo.proximo;
                    if (n.proximo == null) ultimoNo = n;
                    
                    count --;
                    return o;
                }
                n = n.proximo;
                i++;
            }
        }        
        return null;
    }
    // garbage collection (formas de otimização)
    @Override
    public boolean delete(int index) {
        return drop(index) != null;
    }

    @Override
    public boolean remove(Object o) {
        return delete(indexOf(o));
    }

    @Override
    public void clean() {
        primeiroNo = null;
        ultimoNo = null;
        count = 0;
    }

    @Override
    public int count() {
        return this.count;
    }

    @Override
    public boolean has(Object o) {
        return indexOf(o) != -1;
    }

    @Override
    public boolean empty() {
        return this.count == 0;
    }

    @Override
    public int indexOf(Object o) {
        // TODO tenho que melhorar esse método
        No n = primeiroNo;
        int i = 0;
        while (n != null) {
            if (n.elemento.equals(o)) return i;
            n = n.proximo;
            i++;
        }
        return -1;                
    }

    @Override
    public void replace(Object o, int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private class No {
        Object elemento = null;
        No proximo = null;
    }
}

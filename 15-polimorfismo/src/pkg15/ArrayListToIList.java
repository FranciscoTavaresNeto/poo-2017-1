package pkg15;

import java.util.ArrayList;


public class ArrayListToIList implements IList {

    private final ArrayList lista;

    public ArrayListToIList(ArrayList lista) {
        this.lista = lista;
    }

    @Override
    public void append(Object o) {
        lista.add(o);
    }

    @Override
    public void prepend(Object o) {
        lista.add(0, o);
    }

    @Override
    public boolean insert(Object o, int index) {
        lista.add(index, o);
        return true;
    }

    @Override
    public Object get(int index) {
       return lista.get(index);
    }

    @Override
    public Object getFirst() {
        return lista.get(0);
    }

    @Override
    public Object getLast() {
        return lista.get(lista.size() - 1);
    }

    @Override
    public Object drop(int index) {
        return lista.remove(index);
    }

    @Override
    public boolean delete(int index) {
        return drop(index) != null;
    }

    @Override
    public boolean remove(Object o) {
        return lista.remove(o);
    }

    @Override
    public void clean() {
        lista.clear();
    }

    @Override
    public int count() {
        return lista.size();
    }

    @Override
    public boolean has(Object o) {
        return lista.indexOf(o) != -1;
    }

    @Override
    public boolean empty() {
        return lista.isEmpty();
    }

    @Override
    public int indexOf(Object o) {
        return lista.indexOf(o);
    }

    @Override
    public void replace(Object o, int index) {
        lista.remove(index);
        lista.add(index, o);
    }
    
}

package Chapter7.ex7_9;

import java.util.Vector;

class MyStack<T> implements IStack<T> {
    Vector<T> v = new Vector<>();

    public MyStack() {
    }

    @Override
    public T pop() {
        if (v.size() == 0) {
            return null;
        } else {
            return v.remove(0);
        }
    }

    @Override
    public boolean push(T ob) {
        v.add(0, ob);
        return true;
    }
}

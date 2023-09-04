// IN/OUT D(last)<->D<->D<->D<->D(first) IN/OUT

public class MyDeque<T> {

    private Object[] a = new Object[2000];
    public static boolean debug;

    //Используя такие начальные значения индексов, у нас
    //будет свободная память как слева, так и справа.
    private int head = 1000;    //Индекс первого элемента.
    private int tail = 1000;    //Индекс элемента, следующего за последним.

    public void push_front(Object x) {
        head--;
        a[head] = x;
    }

    public void push_back(Object x) {
        a[tail] = x;
        tail++;
    }

    public Object pop_front() {
        if (head != tail) {
            head++;
            return a[head - 1];
        } else
            //Ошибка, попытка извлечь элемент из пустого дека.
            return null;
    }

    public Object pop_back() {
        if (head != tail) {
            tail--;
            return a[tail];
        } else
            //Ошибка, попытка извлечь элемент из пустого дека.
        return null;
    }

    boolean isEmpty() {
        return head == tail;
    }
}

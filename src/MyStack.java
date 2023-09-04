
public class MyStack<T> {
    //public List a = new ArrayList();
    private Object[] a = new Object[1000];
    public static boolean debug;
    private int head = -1;   //Индекс крайнего элемента.

    public void push(Object x) {
        head++;
        if(debug) System.out.println("Вставка эл: " + x);
        a[head] = x;
    }
    public Object peek() {  //функция для просмотра первого элемента очереди, без смещения
        if (head != -1) {
            return a[head];
        } else {
            //Ошибка, попытка извлечь элемент из пустого стека.
        }
        return null;
    }
    public Object pop() {
        if (head != -1) {
            head--;
            if(debug) System.out.println("Взят эл: " + a[head + 1]);
            return a[head + 1];
        } else {
            //Ошибка, попытка извлечь элемент из пустого стека.
        }
        return null;
    }

    public boolean isEmpty() {
        return head == -1;
    }
}

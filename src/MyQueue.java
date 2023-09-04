// IN D(rear)<-D<-D<-D<-D(front) OUT     (<-) = .next

public class MyQueue<T> {
    public static boolean debug;
    private Object[] a = new Object[1000];

        //Для более лаконичной реализации работы, мы будем
        //хранить указатель не на последний элемент, а
        //на следующий за ним (несуществующий).

        //Это, в частности, позволит нам проверять очередь на пустоту
        //простым условием head == tail
        private int head = 0;    //Индекс первого элемента.
        private int tail = 0;    //Индекс элемента, следующего за последним.

        public void push(Object x) {
            a[tail] = x;
            if(debug) System.out.println("Вставка эл: " + x);
            tail++;
        }

    public Object peek() {
        if (head != tail) {
            return a[head];
        } else
            //Ошибка, попытка извлечь элемент из пустой очереди.
            return null;
    }

        public Object pop() {
            if (head != tail) {
                head++;
                if(debug) System.out.println("Взят эл: " + a[head - 1]);
                return a[head - 1];
            } else
                //Ошибка, попытка извлечь элемент из пустой очереди.
                       return null;
        }

        public boolean isEmpty() {
            return head == tail;
        }
    };
